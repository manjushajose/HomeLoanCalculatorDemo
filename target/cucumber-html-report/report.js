$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homeloancalculator.feature");
formatter.feature({
  "line": 1,
  "name": "borrowing calculator",
  "description": "",
  "id": "borrowing-calculator",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "borrowing calculator is determining borrowing estimate correctly.",
  "description": "",
  "id": "borrowing-calculator;borrowing-calculator-is-determining-borrowing-estimate-correctly.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is in the calculator and tools page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters the values in income,other_income,living_exp,current_hme_loan_repay, oth_loan_repay, other_commit,credit_limit fields",
  "rows": [
    {
      "cells": [
        "80000",
        "10000",
        "500",
        "0",
        "100",
        "0",
        "10000"
      ],
      "line": 6
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on work out how much I could borrow button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "borrowing estimate displayed correctly",
  "rows": [
    {
      "cells": [
        "500000"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomeLoanCalculator.user_is_in_the_calculator_and_tools_page()"
});
formatter.result({
  "duration": 11701566400,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanCalculator.user_enters_the_values_in_required_calculator_form_fields(DataTable)"
});
formatter.result({
  "duration": 2521545700,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanCalculator.user_click_on_work_out_how_much_I_could_borrow_button()"
});
formatter.result({
  "duration": 112726300,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanCalculator.borrowing_estimate_displayed_correctly(DataTable)"
});
formatter.result({
  "duration": 70262800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Clicking the ‘start over’ button clears the form",
  "description": "",
  "id": "borrowing-calculator;clicking-the-‘start-over’-button-clears-the-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "start over button is present",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user click on start over button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "form gets cleared",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeLoanCalculator.start_over_button_is_present()"
});
formatter.result({
  "duration": 219716400,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanCalculator.user_click_on_start_over_button()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanCalculator.form_gets_cleared()"
});
formatter.result({
  "duration": 558239600,
  "status": "passed"
});
});