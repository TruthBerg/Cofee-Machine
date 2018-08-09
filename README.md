# Implementation and description

This is a refactoring of my Beverage Machine from Assignment 1 (with some new features). The main change is that I added an interface and concrete classes for making Beverage (Coffee and Tea) objects using the factory pattern. This is an improvement to the flexibility and reusability of my code because the app doesn't know which beverage to create until the user provides their choice at runtime, thus it can now create the appropriate beverage from the user's choice. I also added an interface and set of factory classes for creating CondimentDecorator (Milk and Sugar) objects at runtime, given the user's choice of beverage and the quantity they wish to add.

Additionally, though this a technically a new feature, I added a Menu class in order to display the set of choices in a more readable way and also to allow the user to enter a two-character ID (e.g. "C1" for a regular coffee).

I also added exception handing in order to catch invalid input and prevent the app from crashing when the user enters invalid input. And I re-packaged my classes with the idea that the relationships among objects would be clearer.

# Project Template

This is a Java Maven Project Template


# How to compile the project


[![Build Status](https://travis-ci.org/kiat/JavaProjectTemplate.svg?branch=master)](https://travis-ci.org/kiat/JavaProjectTemplate)  

[![Coverage Status](https://coveralls.io/repos/github/kiat/JavaProjectTemplate/badge.svg?branch=master)](https://coveralls.io/github/kiat/JavaProjectTemplate?branch=master)

[![sonarcloud](https://sonarcloud.io/api/project_badges/measure?project=edu.bu.cs665%3AExample-1&metric=alert_status)](file:https://sonarcloud.io/api/project_badges/measure?project=edu.bu.cs665%3AExample-1&metric=alert_status)

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)


We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run


```bash
java -classpath target/Example-1-1.0-SNAPSHOT-jar-with-dependencies.jar edu.bu.met.cs665.Main
```

or


```bash
run.sh 
```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```

# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


