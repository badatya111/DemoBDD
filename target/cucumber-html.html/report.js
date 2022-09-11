$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "opencart",
  "description": "",
  "id": "opencart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Add members in to pandarasamaj protal",
  "description": "",
  "id": "opencart;add-members-in-to-pandarasamaj-protal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Registration_and_AddtoCart"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The user launch Chrome browser.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The user click on my account link.",
  "keyword": "When "
});
formatter.match({
  "location": "indexDef.launchApp()"
});
formatter.result({
  "duration": 36528460000,
  "status": "passed"
});
formatter.match({
  "location": "indexDef.clickOnMyAccount()"
});
formatter.result({
  "duration": 4289984600,
  "status": "passed"
});
});