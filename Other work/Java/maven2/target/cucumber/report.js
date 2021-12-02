$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('login\login.feature');
formatter.feature({
  "line": 2,
  "name": "Login Function",
  "description": "To enter into the smartbears website\nUser must be able to access website if the login is successful",
  "id": "login-function",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Login",
  "description": "\nGiven: I am on user registration page\n\nWhen:  I enter valid data on the page\n\nThen: User registration should be successful\n\n--------------------------------------------------------------------------------------------------",
  "id": "login-function;login",
  "type": "scenario",
  "keyword": "Scenario"
});
});