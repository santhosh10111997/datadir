$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/work.feature");
formatter.feature({
  "name": "user booking the room",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinion.user_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user go to logion page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user fill the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "suryajoo"
      ]
    },
    {
      "cells": [
        "password",
        "Sharma@45"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinion.user_fill_the_username_and_password(DataTable)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.stepdefinition.StepDefinion.user_fill_the_username_and_password(StepDefinion.java:74)\r\n\tat ✽.user fill the username and password(file:src/test/resources/features/work.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinion.user_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinion.user_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user go to logion page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user fill the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "santhosh"
      ]
    },
    {
      "cells": [
        "password",
        "Sharma"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinion.user_fill_the_username_and_password(DataTable)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.stepdefinition.StepDefinion.user_fill_the_username_and_password(StepDefinion.java:74)\r\n\tat ✽.user fill the username and password(file:src/test/resources/features/work.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinion.user_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user throw the message\"Invalid Login details or Your Password might have expired. Click here to reset your password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinion.user_throw_the_message(String)"
});
formatter.result({
  "status": "skipped"
});
});