$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/EbayHomePage.feature");
formatter.feature({
  "name": "ebay Home page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "title of the page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ebay"
    }
  ]
});
formatter.step({
  "name": "I am on ebayHomepage",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayStepDefinition.i_am_on_ebayHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get title of the page",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayStepDefinition.i_get_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I valiadate the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayStepDefinition.i_valiadate_the_page_title()"
});
formatter.result({
  "status": "passed"
});
});