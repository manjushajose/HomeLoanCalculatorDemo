selenium-cucumber : UI Automation Using Selenium-Cucumber with Java.

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web applications. It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free. 

Pre-requisites

Java
Cucumber
Selenium
Maven
Eclipse
Eclipse Plugins

Setting up selenium-cucumber-java

Install Java and set path.
Install Maven and set path.
After creating maven project, add all dependencies to pon.xml

Framework Components

src/test/java/features - all the cucumber features files (files with .feature ext).
src/test/java/stepdefinitions - ystep defintions corresponding to the feature file has added here.
src/test/java/util - this package contains common utilities (util.java) 
src/test/java/TestRunner - this package contains testrunner.java class which control the test execution. (configure your glue code location (step defintions), define test result output format.(html, json, xml etc). 

Writing a test

The cucumber features should be added to the features library with ".feature" extension.
Add corresponding step definitions to the step definition files. Ensure that for all scenarios in feature file steps are added in the corresponding java file in stepdefinitions.

Running test

From Eclipse IDE
Right click on the project and select  Run as -> Maven Test
From Command prompt
Open the command window
Navigate to the project folder
Type 'mvn test' and hit enter

Checking Report
After each execution Reports will be generated inside /target folder.
