package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage4;

public class HomePage4Test extends TestBase {
	HomePage4 hpage;

	public HomePage4Test() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Initialize();
		hpage = new HomePage4();
	}

	@Test(priority = 1)
	public void isEnabletest() {
		boolean bool = hpage.btnIsEnabled();
		Assert.assertTrue(bool);
	}

	@Test(priority = 2)
	public void isDisabletest() {
		boolean bool = hpage.btnIsDisabled();
		Assert.assertTrue(bool);
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}
