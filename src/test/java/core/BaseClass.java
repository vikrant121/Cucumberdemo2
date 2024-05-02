package core;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	public static WebDriver driver = null; // global var

	public void openBrowser(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		// driver.get(url); // cannot go back / forward -> not prefererd
		// or

		driver.navigate().to(url); // can go back / forward -> prefered

		PageFactory.initElements(driver, this); // reading external xpath
		// implicit wait..
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // one time

		driver.manage().window().maximize();
	}
///----------Generate random emailid------------------//
	public String generateEmailId() {
		
		return (RandomStringUtils.randomAlphabetic(5));
	}

//	public String generatenumber() {
//		return (RandomStringUtils.randomNumeric(3));
//		
//	}
	
	public void closeBrowser() {
		driver.quit();
		// driver.close();
	}
}
