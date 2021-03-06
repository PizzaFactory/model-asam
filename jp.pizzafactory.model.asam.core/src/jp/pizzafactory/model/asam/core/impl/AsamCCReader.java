package jp.pizzafactory.model.asam.core.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import jp.pizzafactory.model.asam.core.AsamCCResource;
import jp.pizzafactory.model.asam.core.internal.Activator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import asam.cc.Ablock;
import asam.cc.Catalog;
import asam.cc.ContainerCatalogFactory;

public class AsamCCReader {

    protected String getTextValue(Node node) {
        String result = null;
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            for (Node child = node.getFirstChild(); child != null; child = child
                    .getNextSibling()) {
                if (child.getNodeType() == Node.TEXT_NODE) {
                    result = child.getNodeValue();
                }
            }
        }
        return result;
    }

    protected List<String> parseInFiles(Node baseNode) throws CoreException {
        List<String> list = new ArrayList<String>();
        NodeList nodes = baseNode.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if ("FILE".equals(node.getNodeName())) {
                list.add(getTextValue(node));
            } else {
                /* error */
            }
        }

        return list;
    }

    protected Ablock parseInAblock(Node baseNode) throws CoreException {
        Ablock ablock = ContainerCatalogFactory.eINSTANCE.createAblock();
        NodeList nodes = baseNode.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                String nodeValue = getTextValue(node);
                switch (node.getNodeName()) {
                case "SHORT-NAME":
                    if (ablock.getShortName() != null) {
                        /* error */
                    } else {
                        ablock.setShortName(nodeValue);
                    }
                    break;
                case "CATEGORY":
                    if (ablock.getCategory() != null) {
                        /* error */
                    } else {
                        ablock.setCategory(nodeValue);
                    }
                    break;
                case "DOMAIN":
                    if (ablock.getDomain() != null) {
                        /* error */
                    } else {
                        ablock.setDomain(nodeValue);
                    }
                    break;
                case "FILES":
                    if (ablock.getFiles().size() != 0) {
                        /* error */
                    } else {
                        ablock.getFiles().addAll(parseInFiles(node));
                    }
                    break;
                default:
                    /* error */
                }
            }
        }

        return ablock;
    }

    protected List<Ablock> parseInAblocks(Node baseNode) throws CoreException {
        List<Ablock> ablocks = new ArrayList<Ablock>();
        NodeList nodes = baseNode.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            String nodeName = node.getNodeName();
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                if (!"ABLOCK".equals(nodeName)) {
                    /* error */
                } else {
                    ablocks.add(parseInAblock(node));
                }
            }
        }
        return ablocks;
    }

    protected Catalog parseInCatalog(Node baseNode) throws CoreException {
        Catalog catalog = ContainerCatalogFactory.eINSTANCE.createCatalog();
        for (Node node = baseNode.getFirstChild(); node != null; node = node
                .getNextSibling()) {
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                String nodeName = node.getNodeName();
                switch (nodeName) {
                case "SHORT-NAME":
                    if (catalog.getShortName() != null) {
                        /* error */
                    } else {
                        catalog.setShortName(getTextValue(node));
                    }
                    break;
                case "ABLOCKS":
                    if (catalog.getABlocks().size() != 0) {
                        /* error */
                    } else {
                        List<Ablock> ablocks = parseInAblocks(node);
                        catalog.getABlocks().addAll(ablocks);
                    }
                    break;
                default:
                    /* error */
                }
            }
        }
        return catalog;
    }

    public void read(AsamCCResource resource, Document document)
            throws CoreException {
        Catalog catalog;
        Node node = document.getDocumentElement();
        if ("CATALOG".equals(node.getNodeName()) && node.hasChildNodes()) {
            catalog = parseInCatalog(node);
            resource.getContents().add(catalog);
        }
    }

    public void read(AsamCCResource resource, InputStream inputStream)
            throws CoreException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(inputStream);
            read(resource, doc);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    e.getMessage(), e);
            throw new CoreException(status);
        }
    }

}
