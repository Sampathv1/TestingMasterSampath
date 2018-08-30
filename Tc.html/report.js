$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Admin.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the following funtionalities on the login module",
  "description": "As an Admin user application should accept only admin credentials",
  "id": "validate-the-following-funtionalities-on-the-login-module",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Launch \"FF\" Browser and enter the \"url\"",
  "rows": [
    {
      "cells": [
        "http://Server/bank"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on admintab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter the username and enter the password",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "FF",
      "offset": 8
    },
    {
      "val": "url",
      "offset": 35
    }
  ],
  "location": "Login.launch(String,String,DataTable)"
});
formatter.result({
  "duration": 11454596550,
  "status": "passed"
});
formatter.match({
  "location": "CommonAnnotations.ClickAdmintab()"
});
formatter.result({
  "duration": 292168431,
  "status": "passed"
});
formatter.match({
  "location": "TC_02_Login_Adminuser.userDetails()"
});
formatter.result({
  "duration": 1148715039,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "This scenario is designed to validate the links after successful login",
  "description": "",
  "id": "validate-the-following-funtionalities-on-the-login-module;this-scenario-is-designed-to-validate-the-links-after-successful-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@tab3"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Click Add Staff member",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Enter the Staff Details and click on Add Staff member",
  "keyword": "And "
});
formatter.match({
  "location": "TC_04_Admin_AddStaff.click_Add_Staff_member()"
});
formatter.result({
  "duration": 1932504,
  "status": "passed"
});
formatter.match({
  "location": "TC_04_Admin_AddStaff.enter_the_Staff_Details_and_click_on_Add_Staff_member()"
});
formatter.result({
  "duration": 1389382238,
  "status": "passed"
});
});