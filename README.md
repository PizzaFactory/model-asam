# EMF Model Support for specs by ASAM.

[![Build Status](https://travis-ci.org/PizzaFactory/model-asam.svg)](https://travis-ci.org/PizzaFactory/model-asam)

What's this
-----------

It is the framework that supports [ASAM/CC](http://wiki.asam.net/display/STANDARDS/ASAM+CC) specified tools.

It provides for now:

* Eclipse bundles
 * The subset of parser for ASAM/CC XML files.
 * The ASAM/CC flavord EMF model.
 * The simple connector for using Maven2 repository as a container contents management system for ASAM/CC.
 * Some Junit tests.

It'll provides in the future:

* Editor for ASAM/CC.
* The fullset ASAM/CC support.
* Maven3 plugin.
* API Documents.

Q&A
---

### Why is it developed?

It is required to use ASAM/CC as the content abstraction layer by [AUTOSAR](http://www.autosar.org/)4.x specification.
There have some functions for AUTOSAR tools. For example, "intended-file."

### Basic concepts?

Using Maven2 repository as the container storage for ASAM/CC based tools.

It is defined "ABLOCK" as the software component unit by ASAM/CC.
On Maven2, the unit is defined as "artifact".
On our framework, all ABLOCKs are mapped to Maven2 artifacts.
The mapping rule is like this.

| ASAM/CC    | Maven2     |
|:-----------|:-----------|
| DOMAIN     | groupId    |
| SHORT-NAME | artifactId |
| CATEGORY   | classifier |

All FILEs in ABLOCK are zipped on install/deploy phase. And FILEs are downloaded/unzipped on demand.
Zip/unzip are executed automatically in API. So "type" in Maven2 artifacts are always "zip".

Maven2 artifacts have each version. But ABLOCK doesn't have. So it must be specified when you call API.
Note that they have different versioning formats between Maven2 and AUTOSAR4.
(Althouth almost same if you don't add build meta-data.)
Our framework doesn't have version abstraction supports for now.

### How do I use API?

API documents not available now.
You may get some helps by reading JUnit tests in the source repository.

### I found some bugs. Please fix them.

Please [Create new issue ticket](https://github.com/PizzaFactory/model-asam/issues/new) on GitHub.
We welcome your pull requests also. 

Same as almost all opensource products, we don't promise fix bugs.
Please consider to buy the professional support pack by [Monami-ya LLC](http://www.monami-ya.com/) if you use this with your commercial product and need some supports.

License
-------

EPL1.0

