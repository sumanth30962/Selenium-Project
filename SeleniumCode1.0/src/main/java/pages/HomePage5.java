package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage5 extends TestBase {
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary' and @id='test5-button']")
	private WebElement btn1;

	// *[@class='alert alert-success' ]

	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement successText;

	public HomePage5() {
		PageFactory.initElements(driver, this);
	}

	public boolean btnIsEnabled() {
		return btn1.isEnabled();
	}

	public void btnclick() {
		TestBase.clickOnWait(btn1, 3000);
	}

	public boolean successTextDisplayed() {
		return successText.isDisplayed();
	}
}
