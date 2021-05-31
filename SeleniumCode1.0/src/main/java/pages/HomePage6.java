package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage6 extends TestBase {

	public HomePage6() {
		PageFactory.initElements(driver, this);
	}

	public WebElement wantedElement(int r, int c) {
		r++;
		c++;
		String path = "//*[@class='table table-bordered table-dark' ]//tbody/tr[" + r + "]//td[" + c + "]";
		return driver.findElement(By.xpath(path));
	}

	public String wantedElementText(int r, int c) {
		WebElement we = wantedElement(r, c);
		return we.getText();
	}
}
