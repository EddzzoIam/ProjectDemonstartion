package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;

	public AccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText = "Edit your account information")
	WebElement Edit_your_account_information;
	
	public WebElement Edit_your_account_information() {
		
		return  Edit_your_account_information;
	}

}
