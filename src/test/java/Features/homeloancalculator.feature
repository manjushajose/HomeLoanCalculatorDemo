Feature: borrowing calculator

Scenario: borrowing calculator is determining borrowing estimate correctly.
	Given user is in the calculator and tools page
	Then user enters the values in income,other_income,living_exp,current_hme_loan_repay, oth_loan_repay, other_commit,credit_limit fields
	| 80000 | 10000 | 500 | 0 | 100 | 0 | 10000 |
	And user click on work out how much I could borrow button 
	Then borrowing estimate displayed correctly 
	| 500000 |

Scenario: Clicking the ‘start over’ button clears the form
		Given start over button is present
		When user click on start over button
		Then form gets cleared
	