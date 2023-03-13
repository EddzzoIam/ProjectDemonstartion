package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="input-email")
	WebElement EmailAddress;
	@FindBy(id="input-password")
	WebElement PasswordField;
	@FindBy(xpath="//input[@value='Login']")
	WebElement LoginButton;
	
	public WebElement EmailAddress() {
		
		return EmailAddress;
	}
	
	
	public WebElement PasswordField() {
		
		
		return PasswordField;
	}
	
	public WebElement LoginButton() {
	
	return LoginButton;
	
	}

}
