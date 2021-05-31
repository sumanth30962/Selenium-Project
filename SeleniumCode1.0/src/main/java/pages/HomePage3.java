package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage3 extends TestBase {
	@FindBy(xpath = "//*[@class='btn btn-secondary dropdown-toggle']")
	private WebElement btn;

	@FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
	private WebElement opt;

	public HomePage3() {
		PageFactory.initElements(driver, this);
	}

	public String defaultText() {
		return btn.getText();
	}

	public void selectOpt() {
		btn.click();
		opt.click();
	}

}
