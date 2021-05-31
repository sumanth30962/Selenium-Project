package testcases;

import base.TestBase;
import pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
	HomePage hpage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Initialize();
		hpage = new HomePage();
	}

	@Test
	public void homepagetitletest() {
		String title = hpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Home");
	}

	@Test
	public void hpusrnametest() {
		boolean flag = hpage.weusrnameIsEnable();
		Assert.assertTrue(flag);
	}

	@Test
	public void hppasswordtest() {

		boolean flag = hpage.wepasswordIsEnable();
		Assert.assertTrue(flag);
	}

	@Test
	public void hpsigninbtntest() {

		boolean flag = hpage.wesigninbtnIsEnable();
		Assert.assertTrue(flag);
	}

	@Test
	public void hplogintest() {
		hpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}

}
