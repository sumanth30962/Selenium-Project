package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage5;

public class HomePage5Test extends TestBase {
	HomePage5 hpage;

	public HomePage5Test() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Initialize();
		hpage = new HomePage5();
	}

	@Test(priority = 1)
	public void clickbtn1test() {
		hpage.btnclick();
	}

	@Test(priority = 2)
	public void isbtndistest() {
		hpage.btnclick();
		boolean bool = hpage.btnIsEnabled();
		Assert.assertFalse(bool);
	}

	@Test(priority = 3)
	public void isdisplayedtexttest() {
		hpage.btnclick();
		boolean bool = hpage.successTextDisplayed();
		Assert.assertTrue(bool);
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}
