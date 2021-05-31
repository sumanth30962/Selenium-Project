package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchField;

	@FindBy(xpath = "//h4[contains(text(),'Brocolli')]//parent::div//div[2]//a[@class='decrement']")
	WebElement brocolliCntDecrement;

	@FindBy(xpath = "//h4[contains(text(),'Brocolli')]//parent::div//div[2]//a[@class='increment']")
	WebElement brocolliCntIncrement;

	@FindBy(xpath = "///h4[contains(text(),'Brocolli')]//parent::div//div[2]//input")
	WebElement brocolliCnt;

}