package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	@FindBy(id = "inputEmail")
	private WebElement usrname;

	@FindBy(id = "inputPassword")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Signinbtn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean weusrnameIsEnable() {
		return usrname.isEnabled();
	}

	public boolean wepasswordIsEnable() {
		return password.isEnabled();
	}

	public boolean wesigninbtnIsEnable() {
		return Signinbtn.isEnabled();
	}

	public void login(String un, String pwd) {
		usrname.sendKeys(un);
		password.sendKeys(pwd);
	}

}
