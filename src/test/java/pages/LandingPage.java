package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@title='My Account']")
	WebElement MyAccountDropDown;
	@FindBy(linkText = "Login")

	WebElement LoginOption;

	@FindBy(linkText = "Register")
	WebElement LoginOptions;

	/// RIGHTMOVE ELEMENTS

	@FindBy(xpath = "//button[@class='optanon-allow-all accept-cookies-button']")
	WebElement cookiesButton;

	@FindBy(xpath = "//input[@class='ksc_inputText ksc_typeAheadInputField']")
	WebElement searchBox;

	@FindBy(xpath = "//input[@class='ksc_inputText ksc_typeAheadInputField']")
	List<WebElement> autoComplete;

	@FindBy(xpath = "//button[normalize-space()='For Sale']")
	WebElement saleButton;

	// Google
	@FindBy(xpath = "//div[@class='QS5gu sy4vM']")
	WebElement cookiepolicy;

	@FindBy(xpath = "//input[@aria-label='Search']")
	WebElement googleSearch;

	@FindBy(xpath = "//h3[normalize-space()='Yahoo Mail']")
	WebElement yahooLogin;
	@FindBy(xpath = "//input[@id='login-username']")
	WebElement UserName;
	@FindBy(xpath = "//input[@id='login-signin']")
	WebElement signButton;

	public WebElement MyAccountDropDown() {

		return MyAccountDropDown;

	}

	public WebElement LoginOption() {

		return LoginOption;
	}

	public WebElement LoginOptions() {

		return LoginOptions;
	}

//RIGHTMOVE METHODS
	public WebElement cookiesButton() {
		// driver.switchTo().defaultContent();
		// driver.switchTo().frame(driver.findElement(By.id("gdpr-consent-notice")));

		return cookiesButton;
	}

	public WebElement searchBox() {

		return searchBox;
	}

	public List<WebElement> autoComplete() {

		return autoComplete;
	}

	public WebElement saleButton() {

		return saleButton;
	}
	// Google

	public WebElement cookiepolicy() {

		return cookiepolicy;
	}

	public WebElement googleSearch() {
		return googleSearch;
	}

	public WebElement yahooLogin() {
		return yahooLogin;
	}

	public WebElement UserName() {

		return UserName;
	}

	public WebElement  signButton() {
		
		return  signButton;
	}
}
