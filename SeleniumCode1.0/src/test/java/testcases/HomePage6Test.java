package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage6;

public class HomePage6Test extends TestBase {
	HomePage6 hpage;

	public HomePage6Test() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Initialize();
		hpage = new HomePage6();
	}

	@Test(priority = 1)
	public void checkElementText() {
		int r = Integer.parseInt(prop.getProperty("row_num"));
		int c = Integer.parseInt(prop.getProperty("col_num"));
		String text = hpage.wantedElementText(r, c);
		Assert.assertEquals("Ventosanzap", text);
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}
