$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/loginf.feature");
formatter.feature({
  "name": "login into website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User provides email and fills registration form",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user provides \"\u003cEmail\u003e\" and clicks on createbutton",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "When "
});
formatter.step({
  "name": "user fills \"\u003cTitle\u003e\" and \"\u003cCFirstName\u003e\" and \"\u003cCLastName\u003e\" and \"\u003cPassword\u003e\" and \"\u003cDate\u003e\" and \"\u003cMonth\u003e\" and \"\u003cYear\u003e\" and \"\u003cCompany\u003e\" and \"\u003cAddress\u003e\" and \"\u003cCity\u003e\" and \"\u003cState\u003e\" and \"\u003cZipCode\u003e\" and \"\u003cCountry\u003e\" and \"\u003cMobile\u003e\" and \"\u003cAlias\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "clicks on register button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email",
        "Title",
        "CFirstName",
        "CLastName",
        "Password",
        "Date",
        "Month",
        "Year",
        "Company",
        "Address",
        "City",
        "State",
        "ZipCode",
        "Country",
        "Mobile",
        "Alias"
      ]
    },
    {
      "cells": [
        "Z2@gmail.com",
        "Mr.",
        "Same",
        "Lambe",
        "123456\u0026",
        "12",
        "3",
        "1937",
        "Bayer",
        "4, Santa",
        "Alabama",
        "1",
        "35000",
        "1",
        "25147",
        "samba"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user opens the url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.LoginStepDef.user_opens_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries click on Sign in link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.LoginStepDef.user_tries_click_on_Sign_in_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to sign in page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.LoginStepDef.user_is_navigated_to_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User provides email and fills registration form",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user provides \"Z2@gmail.com\" and clicks on createbutton",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.LoginStepDef.clicks_on_Create_Account_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on registration page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.LoginStepDef.user_is_on_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills \"Mr.\" and \"Same\" and \"Lambe\" and \"123456\u0026\" and \"12\" and \"3\" and \"1937\" and \"Bayer\" and \"4, Santa\" and \"Alabama\" and \"1\" and \"35000\" and \"1\" and \"25147\" and \"samba\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.LoginStepDef.user_registration(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.LoginStepDef.clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/register.feature");
formatter.feature({
  "name": "Registration successful",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User account successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is on accounts page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.RegisterStepDef.registration_Page()"
});
formatter.result({
  "status": "passed"
});
});