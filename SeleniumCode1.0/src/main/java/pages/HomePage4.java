package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage4 extends TestBase {

	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary']")
	private WebElement btn1;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-secondary']")
	private WebElement btn2;

	public HomePage4() {
		PageFactory.initElements(driver, this);
	}

	public boolean btnIsEnabled() {
		return btn1.isEnabled();
	}

	public boolean btnIsDisabled() {
		return !(btn2.isEnabled());
	}
}
