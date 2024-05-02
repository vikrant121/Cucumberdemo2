package Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class customerstef extends Hook {

	@Given("User Launch the {string} browser and opens URL {string}")
	public void user_launch_the_browser_and_opens_url(String browser, String url) throws Exception {
		openBrowser(browser, url);
		utility.Exentreport.generateReport("NopCommerce"); // Generate report Start
		utility.Exentreport.test.log(LogStatus.INFO, "Website open");
	}

	@Given("User enters Email {string} and Password  {string}")
	public void user_enters_email_and_password(String email, String Password) {
		Email.clear();
		Email.sendKeys(email);
		password.clear();
		password.sendKeys(Password);
		utility.Exentreport.test.log(LogStatus.INFO, "Verify Email and Password");
	}

	@Given("Click on the Login")
	public void click_on_the_login() {
		CLickloginbtn.click();
	}

	@Then("User can view the Dashboad")
	public void user_can_view_the_dashboad() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Dashboard / nopCommerce administration";
		// System.out.println(Dashboard.getText());
		if (actualTitle.equals(expectedTitle)) {
			utility.Exentreport.test.log(LogStatus.PASS, "User can view Dashboad");
			Assert.assertTrue(true);
		} else {
			utility.Exentreport.test.log(LogStatus.FAIL, "User can not view Dashboad");
			Assert.assertTrue(false);
		}
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {
		Clickmenubtn.click();
	}
	
	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
		clickoncustomer.click();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		Addnewbtn.click();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		String actualTitle1 = driver.getTitle();
		System.out.println(" actual= " + actualTitle1);
		String expectedTitle1 = "Add a new customer / nopCommerce administration";
		if (actualTitle1.equals(expectedTitle1)) {
			utility.Exentreport.test.log(LogStatus.PASS, "User can view Add new customer page");
			Assert.assertTrue(true);
		} else {
			utility.Exentreport.test.log(LogStatus.FAIL, "User can not view Add new customer page");
			Assert.assertTrue(false);
		}
	}

	@When("User enter customer info {int}")
	public void user_enter_customer_info(Integer int1) {
		// addNewCustPg.enterEmail("cs129@gmail.com");
//		email.sendKeys("te2saag@gmail.com");
		email.sendKeys(generateEmailId() + "@yopmail.com");
		Password.sendKeys("test1");
		FirstName.sendKeys("Prachi");
		LastName.sendKeys("Gupta");
		gender.click();
		Dateofbirth.sendKeys("6/13/1988");
		Company.sendKeys("CodeStudio");
		checkbox.click();
		newslatterdropdown.click();
		newslatterdropdown1.click();
		Admincomment.sendKeys("Test data");
		Select vender = new Select(dropdown1);
		vender.selectByVisibleText("Vendor 1");
		utility.Exentreport.test.log(LogStatus.INFO, "All data filled succussfully added");

	}

	@When("click on Save button")
	public void click_on_save_button() {
		savebtn.click();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		String bodyTagText = bodyTagText1.getText();
		String exptectedConfirmationMsg = "The new customer has been added successfully.";
		if (bodyTagText.contains(exptectedConfirmationMsg)) {
			Assert.assertTrue(true);// pass
			utility.Exentreport.test.log(LogStatus.PASS, "User can view confirmation message");
			// log.info("User can view confirmation message - passed");

		} else {
			// log.warn("User can view confirmation message - failed");
			utility.Exentreport.test.log(LogStatus.FAIL, "User can not view confirmation message");
			Assert.assertTrue(false); // fail
		}
	}

	// -----------------------------------------------Search Customer by Email--------------------------------------------------//
	@When("Enter customer Email")
	public void enter_customer_email() {
		clickemail.click();
		clickemail.sendKeys("admin@yourStore.com");
	}

	@When("Click on search button")
	public void click_on_search_button() throws Exception {
		searchbtn.click();
		utility.Exentreport.test.log(LogStatus.INFO, "searched ");

	}

	@And("close the browser")
	public void close_the_browser() throws Exception {
		utility.Exentreport.endReport();
		closeBrowser();
	}

}

//		@Then("User should found Email in the Search table")
//		public void user_should_found_email_in_the_search_table() 
//		{
//			String actualTitle1 = getactultext.getText();
//			String expectedTitle1 = "CLJCp@gmail.com";
//
//			if (actualTitle1.equals(expectedTitle1)) {
//
//				Assert.assertTrue(true);
//
//			} else {
//				Assert.assertTrue(false);
//	        
//			}
//		}
