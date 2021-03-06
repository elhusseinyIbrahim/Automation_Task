# Automation Task
This is where I Show My Knowledge and Skills in Test Automation!

### The main Frameworks included in the project:
* SHAFT: Unified Test Automation Engine

### Project Design:
* Page Object Model (POM) design pattern
* Data Driven framework
* Fluent design approach (method chaining)
* Implementing the ***Test Automation Pyramid*** by having 2 different test automation levels which are SERVICE and GUI layers
* Attaching a screenshot to the ***Allure Report***  report (in case of gui)  
* Attaching the response body to the ***Allure Report***  report (in case of api)

### Project Test Cases:
### Web GUI Test Automation:
### First Test
* Navigate to "https://www.google.com/ncr" 
* Search for "selenium webdriver" 
* Check that the third result text contains "What is Selenium WebDriver?" 
### second Test
* Navigate to "https://the-internet.herokuapp.com/" 
* Click on "File Upload" 
* Upload any small image file 
* Check that the file has been uploaded successfully 
### Third Test
* Navigate to "https://the-internet.herokuapp.com/" 
* Click on "Dynamic Loading" 
* Click on "Example 2" 
* Click "Start" 
* Wait for loading to finish 
* Check that the text displayed is "Hello World!" 
### API Test Automation:
* Navigate to "https://alexwohlbruck.github.io/cat-facts/" 
* Use the relevant API endpoint to get one random cat fact 
* Check that the response "text" is not empty
### How to run the project main test cases locally:
* Simply import this project to your eclipse (or favorite JAVA IDE) 
* If you wish to use SHAFT with <b>IntelliJ</b> please apply these settings:<br/>Run/Debug Configurations > Edit Configurations... > Templates > TestNG > Configuration > Listeners > Add all SHAFT_Engine Listeners [AlterSuite, InvokedMethod, Suite]
* You can Run the Project Using CMD ("mvn test -Dtest="HeroKuappTestCases,GoogleSearchTestCase,RandomCatFactTestCase")
* Watch this simple 5-minute live-demo: 
  https://drive.google.com/file/d/1NxBpObvbBHdMjL4tl7PlpRNi7U9lMfW8/view
* You Can find the test cases in the *src/test/java* folder mainly.
* After executing, you can easily generate the ***Allure Report***  you can find the Extent Report ***generate_allure_report.Bat*** in the project root path for the latest execution

### Important Links:
- ??????  [Configuration Manager](https://mohabmohie.github.io/SHAFT_ENGINE/)
- ????  [User Guide](https://mohabmohie.github.io/SHAFT_Engine_Docusaurus/)
- ????  [Javadocs](https://mohabmohie.github.io/SHAFT_ENGINE/apidocs/index.html)
- ????  Latest Test Execution Reports:
  - [Windows/Edge](https://mohabmohie.github.io/SHAFT_ENGINE/allure/Windows/Web/index.html) - [Mac/Safari](https://mohabmohie.github.io/SHAFT_ENGINE/allure/macOS/Web/index.html) - [Linux/Firefox](https://mohabmohie.github.io/SHAFT_ENGINE/allure/Linux/Web/index.html) - [Native/Android](https://mohabmohie.github.io/SHAFT_ENGINE/allure/MobileNative/Android/index.html)
- ??????  Related Projects:
  - [using SHAFT_Engine](https://github.com/MohabMohie/using_SHAFT_ENGINE)
  - [User Guide](https://github.com/MohabMohie/SHAFT_Engine_Docusaurus)
  
 


