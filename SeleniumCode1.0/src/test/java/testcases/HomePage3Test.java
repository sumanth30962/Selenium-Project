package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage3;

public class HomePage3Test extends TestBase {
	HomePage3 hpage;

	public HomePage3Test() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Initialize();
		hpage = new HomePage3();
	}

	@Test(priority = 1)
	public void defaultTexttest() {
		String dtext = hpage.defaultText();
		Assert.assertEquals(dtext, "Option 1");
	}

	@Test(priority = 2)
	public void Changeopttest() {
		hpage.selectOpt();
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}
