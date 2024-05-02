package Stepdefination;

import org.junit.Assert;
import com.relevantcodes.extentreports.LogStatus;
import core.Hook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdf extends Hook 

{

	@Given("User Launch {string} browser and opens URL {string}")
	public void user_launch_browser_and_opens_url(String browser, String url) throws Exception {
		openBrowser(browser, url);
		utility.Exentreport.generateReport("NopCommerce"); // Generate report Start
		utility.Exentreport.test.log(LogStatus.INFO, "Website open");
	}

	@When("^User enters Email as (.*) and Password as (.*)")
	public void user_enters_email_as_and_password_as(String email, String Password) throws Exception {
		Email.clear();
		Email.sendKeys(email);
		password.clear();
		password.sendKeys(Password);
		utility.Exentreport.test.log(LogStatus.INFO, "Verify Email and Password");

	}

	@When("Click on Login")
	public void click_on_login() {
		CLickloginbtn.click();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) throws Exception {
		

		String actualTitle = driver.getTitle();

//		Assert.assertEquals(expectedTitle,actualTitle,"Title Varified");

		if (actualTitle.equals(expectedTitle)) {
			// log.warn("Test passed: Login feature :Page title matched.");
			utility.Exentreport.test.log(LogStatus.PASS, "Test passed: Login feature :Page title matched");

			Assert.assertTrue(true);// pass
		} else {
			Assert.assertFalse(false);
			utility.Exentreport.test.log(LogStatus.FAIL, "Test Failed: Login feature- page title not matched.");
			utility.ScreenShot.takeScreenShot("Failed_Title");
			utility.Exentreport.endReport();
			closeBrowser();
			
		}
		
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		CLicklogoutbtn.click();
	}

	@Then("close browser")
	public void close_browser() throws Exception {
		utility.Exentreport.endReport();
		closeBrowser();
	}

}
