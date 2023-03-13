package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager extends DriverManager {

	private WebDriver initChromeDriver() {

		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();

	}

	private WebDriver initFireFox() {

		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}

	private WebDriver initIE1() {

		WebDriverManager.iedriver().setup();
		return new EdgeDriver();
	}

	private WebDriver initChromeHeadless() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-gpu", "--headless");
		return new ChromeDriver(options);

	}

	private WebDriver initFireFoxHeadless() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-gpu", "--headless");
		return new FirefoxDriver(options);

	}

	private WebDriver initIeHeadless() {

		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-gpu", "--headless");
		return new EdgeDriver(options);

	}

	public void launchBrowser(String browser) throws InterruptedException {

		switch (browser) {

		case "Chrome":
			driver = initChromeDriver();
			break;
		case "Firefox":
			driver = initFireFox();
			break;
		case "Ie":
			driver = initIE1();
			break;

		case "ChromeHeadless":
			driver = initChromeHeadless();
			break;
		case "FireFoxHeadless":
			driver = initFireFoxHeadless();
			break;
		case "IeHeadless":
			driver = initIeHeadless();
			break;
		default:
			driver = initChromeDriver();
			break;
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}

	public void closeBrowser() {
		driver.manage().deleteAllCookies();
		driver.close();

	}
}
