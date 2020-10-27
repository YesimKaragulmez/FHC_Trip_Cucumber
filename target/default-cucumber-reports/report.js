$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/fhclogin.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fhclogin"
    }
  ]
});
formatter.scenario({
  "name": "2011 Manager is able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fhclogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.FhcTrip_Login.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Log in link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcTrip_Login.click_on_Log_in_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on user name text box and type it \"manager2\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcTrip_Login.click_on_user_name_text_box_and_type_it(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on password name text box and type it \"Man1ager2!\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcTrip_Login.click_on_password_name_text_box_and_type_it(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcTrip_Login.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify LISTOFUSERS text is located",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.FhcTrip_Login.verify_LISTOFUSERS_text_is_located()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});