$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/schoolFeatures/studentDelete.feature");
formatter.feature({
  "name": "Deleting Student to the School database",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Bea1"
    }
  ]
});
formatter.background({
  "name": "User in on the School Login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User1 on the web page and login username \"SchoolLogIn\" and password \"SchoolPassword\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SchoolStudentDelete_steps.user_on_the_web_page_and_login_username_and_password(Integer,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User1 is clicking on LogIn Button",
  "keyword": "When "
});
formatter.match({
  "location": "SchoolStudentDelete_steps.user_is_clicking_on_LogIn_Button(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deleting a Student",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Bea1"
    },
    {
      "name": "@Munevver\u0026Bilal"
    }
  ]
});
formatter.step({
  "name": "User clicks on the Students dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "SchoolStudentDelete_steps.user_clicks_on_the_Students_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on All Students",
  "keyword": "And "
});
formatter.match({
  "location": "SchoolStudentDelete_steps.user_clicks_on_All_Students()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on dropdown toggle next to the students name",
  "keyword": "And "
});
formatter.match({
  "location": "SchoolStudentDelete_steps.user_will_click_on_dropdown_toggle_next_to_the_students_name()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//div/h4/a[.\u003d\u0027mnwr\u0027]/../../div)[2]\"}\n  (Session info: chrome\u003d76.0.3809.100)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Bilals-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1cb4:7755:4abf:39e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.100, chrome: {chromedriverVersion: 76.0.3809.68 (420c9498db8ce..., userDataDir: /var/folders/n3/g4gmcd850pj...}, goog:chromeOptions: {debuggerAddress: localhost:58415}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a889581dc2fe9c071f360b542c077de8\n*** Element info: {Using\u003dxpath, value\u003d(//div/h4/a[.\u003d\u0027mnwr\u0027]/../../div)[2]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\n\tat steps.SchoolStudentDelete_steps.user_will_click_on_dropdown_toggle_next_to_the_students_name(SchoolStudentDelete_steps.java:35)\n\tat ✽.User will click on dropdown toggle next to the students name(src/test/resources/schoolFeatures/studentDelete.feature:13)\n",
  "status": "failed"
});
formatter.step({
  "name": "User will click on Delete button",
  "keyword": "And "
});
formatter.match({
  "location": "SchoolStudentDelete_steps.user_will_click_on_Delete_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Tester verifies that Students name nolonger is in DataBase",
  "keyword": "Then "
});
formatter.match({
  "location": "SchoolStudentDelete_steps.tester_verifies_that_Students_name_nolonger_is_in_DataBase()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});