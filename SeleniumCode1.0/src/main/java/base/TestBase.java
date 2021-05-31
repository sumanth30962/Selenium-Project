package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utiles.TestUtils;

public class TestBase {
	public static WebDriverWait wait;
	public static WebDriver driver;
	public static Properties prop;
	public static String userdir = System.getProperty("user.dir");

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(userdir + "\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public static void Initialize() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", userdir + "\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("window-size=1200x600");
            driver = new ChromeDriver(options);
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

	@SuppressWarnings("deprecation")
	public static void clickOnWait(WebElement loc, int timeout) {
		wait = new WebDriverWait(driver, timeout);
		WebElement firstResult = wait.ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(loc));
		firstResult.click();
	}
}
