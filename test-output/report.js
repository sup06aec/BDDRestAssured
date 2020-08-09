$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "NOP commerce application Test",
  "description": "",
  "id": "nop-commerce-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate nopcommerce Home Page Test",
  "description": "",
  "id": "nop-commerce-application-test;validate-nopcommerce-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 19502015400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 594359500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1732186300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 7865241600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.home_page_is_displayed()"
});
formatter.result({
  "duration": 161863300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_title()"
});
formatter.result({
  "duration": 90665500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_closes_the_browser()"
});
formatter.result({
  "duration": 5837869200,
  "status": "passed"
});
});