package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage2;

public class HomePage2Test extends TestBase {
	HomePage2 hpage;

	public HomePage2Test() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Initialize();
		hpage = new HomePage2();
	}

	@Test
	public void elementsSizetest() {
		int size = hpage.findsize();
		Assert.assertEquals(3, size);
	}

	@Test
	public void secElementtexttest() {
		String text = hpage.secElementText();
		Assert.assertEquals(text, "List Item 2");
	}

	@Test
	public void secElementBadgetexttest() {
		String btext = hpage.secElementBadgeText();
		Assert.assertEquals("6", btext);
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}
