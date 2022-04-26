# AMC_QA_rectuitment_task
Assumptons: a JDK environment set up on your local machine (Java_1.8 preffered to avoid any incompatibilities).
Test were written for a web-based application for on a Google Chrome browser (a prerequisite for a test run).

Run instruction:
1) Get the QA-coding-task project stored on GitHub under the link: https://github.com/schastny/QA-coding-task and save it to your local destination.
2) Unzip the ui.zip project so that the following folders' structure is present:
    a)'ui' folder:
      I) index.html
      II)'static' folder
3) Download the test repo framework from: https://github.com/Piter759/AMC_QA_rectuitment_task (also save it to you local drive).
4) All the necessary dependencies were added to POM file.
5) The externall file which needs to be aligned with your local browser's version is the chromedriver.exe (check your Google's Chrome version and download the respective driver so that framework can run without any obstacles. In my framework's repo the ChromeDriver 100.0.4896.60 was used for Google Chrome browser (version 100.0.4896).
6) Please exchange the chromedriver.exe file with downloaded from my repo's link with the one aligned to your local instance of Google Chrome browser.
7) Please set a JDK to 'Java_1.8' in project's settings in your local IDE environment.
8) Once the above is mentined is set up accordingly please open please open the project's structure:
    a) AMC_QA_recrutiment_task_project -> src -> main -> java -> TestPlan.java
9) Run the framework using the (IntelliJ's) shortcut: Shift + F10 (or any other available button to run the code in case of different IDEs).
10) The compilation should be done without any errors.
11) 4 test cases will ran within the test suite:
    a) Match case check for a particular value from the drop-down list
    b) Non-match case check for a particular value from the drop-down list
    c) 'Clear filters' button functional check
    d) Emails validity check
12) Please consider the two first test cases as a one due to the fact that they check two different states of one general functionality - match-case search using check-box.
13) Technology stack used in this testing framework:
    a) Java
    b) Selenium WebDriver framework
    c) TestNG framework
    d) Maven build tool
    e) Apache Commons Validator plugin
    f) SureFire plugin
 14) There was an intented assumption not to modify the original project under the link: https://github.com/schastny/QA-coding-task and therefore some neccessary adjustments were made to make the framework working.
 
