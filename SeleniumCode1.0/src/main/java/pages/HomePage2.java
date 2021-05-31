package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class HomePage2 extends TestBase {
	@FindBy(xpath = "//*[@class='list-group-item justify-content-between']")
	private List<WebElement> allelements;

	@FindBy(xpath = "(//*[@class='list-group-item justify-content-between'])[2]")
	private WebElement secElement;

	@FindBy(xpath = "(//*[@class='list-group-item justify-content-between'])[2]/span")
	private WebElement secElementBadge;

	public HomePage2() {
		PageFactory.initElements(driver, this);
	}

	public int findsize() {
		return allelements.size();
	}

	public String secElementText() {
		return secElement.getText().replace(secElementBadgeText(), "").trim();
	}


}
