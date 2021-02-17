package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import org.junit.Assert; 

public class HomeLoanCalculator {
	static WebDriver driver;

@Given("^user is in the calculator and tools page$")
public void user_is_in_the_calculator_and_tools_page() {
    System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
        String title = driver.getTitle();
    Assert.assertEquals("Home loan borrowing power calculator | ANZ", title);
    System.out.println("assertion passsed");
    
}

@Then("^user enters the values in income,other_income,living_exp,current_hme_loan_repay, oth_loan_repay, other_commit,credit_limit fields$")
public void user_enters_the_values_in_required_calculator_form_fields(DataTable details) {
	
	List<List<String>> data = details.raw();
	driver.findElement(By.xpath("//input[@aria-labelledby=\"q2q1\"]")).sendKeys(data.get(0).get(0));
    driver.findElement(By.xpath("//input[@aria-labelledby=\"q2q2\"]")).sendKeys(data.get(0).get(1));
	driver.findElement(By.xpath("//*[@id=\"expenses\"]")).sendKeys(data.get(0).get(2));
	driver.findElement(By.xpath("//*[@id=\"homeloans\"]")).sendKeys(data.get(0).get(3));
	driver.findElement(By.xpath("//*[@id=\"otherloans\"]")).sendKeys(data.get(0).get(4));
	driver.findElement(By.xpath("//input[@aria-labelledby=\"q3q4\"]")).sendKeys(data.get(0).get(5));
	driver.findElement(By.xpath("//input[@aria-labelledby=\"q3q5\"]")).sendKeys(data.get(0).get(6)); 
    
}

@And("^user click on work out how much I could borrow button$")
public void user_click_on_work_out_how_much_I_could_borrow_button()  {
	WebElement how_much_borrow_btn = driver.findElement(By.xpath("//*[@id=\"btnBorrowCalculater\"]"));
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("arguement[0].click();", how_much_borrow_btn);
	how_much_borrow_btn.click(); 
}

@Then("^borrowing estimate displayed correctly$")
public void borrowing_estimate_displayed_correctly(DataTable borrow_amnt) {
	System.out.println("borrowing estimate displayed correctly$");
	List<List<String>> amount = borrow_amnt.raw();
	System.out.println("after raw method");
	String brw_amnt = driver.findElement(By.xpath("//*[@id=\"borrowResultTextAmount\"]")).getAttribute("value");
	String brw_amnt_actual = brw_amnt.replace(",", "");
	//int brw_amnt_i = Integer.parseInt(brw_amnt_m);
	//System.out.println("brw_amnt is :"+brw_amnt_i);

	System.out.println("amount is : "+amount.get(0).get(0));
	Assert.assertEquals(amount.get(0).get(0), brw_amnt_actual);
   
}


@Given("^start over button is present$")
public void start_over_button_is_present() throws InterruptedException {
System.out.println("starting start over button check");

driver.findElement(By.xpath("//*[@class=\"btn btn--primary\"]"));
System.out.println("element found:");
driver.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/button")).click();
	//*[@class="icon icon_restart"]
	System.out.println("start over button is present");
}

@When("^user click on start over button$")
public void user_click_on_start_over_button() throws Throwable {
	//driver.findElement(By.xpath("//*[@class=\"icon icon_restart\"]")).click();
}

@Then("^form gets cleared$")
public void form_gets_cleared() {
	String income = driver.findElement(By.xpath("//input[@aria-labelledby=\"q2q1\"]")).getAttribute("value");
	Assert.assertEquals("0", income);
	String other_income = driver.findElement(By.xpath("//input[@aria-labelledby=\"q2q2\"]")).getAttribute("value");
	Assert.assertEquals("0", other_income);
	String living_exp = driver.findElement(By.xpath("//*[@id=\"expenses\"]")).getAttribute("value");
	Assert.assertEquals("0", living_exp);
	String crnt_home_loan = driver.findElement(By.xpath("//*[@id=\"homeloans\"]")).getAttribute("value");
	Assert.assertEquals("0", crnt_home_loan);
	String other_loan = driver.findElement(By.xpath("//*[@id=\"otherloans\"]")).getAttribute("value");
	Assert.assertEquals("0", other_loan);
	String other_commit = driver.findElement(By.xpath("//input[@aria-labelledby=\"q3q4\"]")).getAttribute("value");
	Assert.assertEquals("0", other_commit);
	String credit_limit = driver.findElement(By.xpath("//input[@aria-labelledby=\"q3q5\"]")).getAttribute("value"); 
	Assert.assertEquals("0", credit_limit);
	System.out.println("All assertions passed");
	System.out.println("All fields are cleared");
	driver.close();
    
    
}
}