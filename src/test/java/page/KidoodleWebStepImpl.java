package page;

import base.Base;
import base.DriverContext;
import constant.ConstantFile;
import constant.Xpath_Locator_Kidoodle_Web;
import org.openqa.selenium.*;
import org.testng.Assert;
import utilities.ExcelUtil;
import utilities.ScreenShotUtil;
import utilities.WebUtil;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class KidoodleWebStepImpl {

	WebDriver driver = DriverContext.getDriver();

	public void loginKidoodleWeb() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ConstantFile.TIMEOUT10, TimeUnit.SECONDS);
		driver.get(Xpath_Locator_Kidoodle_Web.mainPageURL);
		ScreenShotUtil.addScreenShot();
	}

	public void checkPage(String page) {
		switch (page) {
			case "Kidoodle home":
				Assert.assertTrue(WebUtil.waitElementVisible(Xpath_Locator_Kidoodle_Web.kidoodleHomeHeader, ConstantFile.TIMEOUT10));
				break;
		}
		ScreenShotUtil.addScreenShot();
	}

	public void userInputs(String field) {
		switch (field) {
			case "Email Address":
				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.emailInputField)).clear();
//				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.mobileInputField)).sendKeys(ConstantFile.EMAIL);
				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.emailInputField)).sendKeys(ExcelUtil.getValue("email"));
				break;
			case "Password":
				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.pwInputField)).clear();
//				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.pwInputField)).sendKeys(ConstantFile.PWD);
				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.pwInputField)).sendKeys(ExcelUtil.getValue("password"));
				break;
		}
		ScreenShotUtil.addScreenShot();
	}

	public void userClicks(String button) {
		switch (button) {
			case "Sign In":
				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.signInBtn)).click();
				Base.delay(3);
				break;
			case "Register":
				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.registerBtn)).click();
				Base.delay(3);
				break;
			case "SIGN IN":
				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.SIGNINBtn)).click();
				Base.delay(3);
				break;
			case "Avatar 1":
				driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.avatar1Btn)).click();
				Base.delay(3);
				break;
		}
		ScreenShotUtil.addScreenShot();
	}

	public void userCanSee(String result) throws IOException, ParseException {
		switch (result) {
			case "Who's watching?":
				if(WebUtil.waitElementVisible(Xpath_Locator_Kidoodle_Web.avatar1Icon, ConstantFile.TIMEOUT5)){
					driver.findElement(By.xpath(Xpath_Locator_Kidoodle_Web.avatar1Icon)).click();
				}
				Assert.assertTrue(WebUtil.waitElementVisible(Xpath_Locator_Kidoodle_Web.whosWatchingText, ConstantFile.TIMEOUT5));
				Assert.assertTrue(WebUtil.waitElementVisible(Xpath_Locator_Kidoodle_Web.fiveProfilesText, ConstantFile.TIMEOUT5));
				break;
			case "Page with logged in icon":
				Assert.assertTrue(WebUtil.waitElementVisible(Xpath_Locator_Kidoodle_Web.avatar1Icon, ConstantFile.TIMEOUT5));
				break;
		}
		ScreenShotUtil.addScreenShot();
	}
}

	
