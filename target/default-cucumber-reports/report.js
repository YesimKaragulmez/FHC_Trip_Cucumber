$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Negativelogin.feature");
formatter.feature({
  "name": "Negativelogin feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Negativelogin"
    }
  ]
});
formatter.scenario({
  "name": "Negative scenario with wrong credential username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Negativelogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the fhctrip.com",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Negativelogin_Test.user_on_the_fhctrip_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the wrong credentials",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Negativelogin_Test.user_enter_the_wrong_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the errormessage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Negativelogin_Test.verify_the_errormessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});