package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage {
	
	WebDriver driver;

	public RegisterAccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	
	
	@FindBy (id ="input-firstname")
	private WebElement firstName;
	@FindBy(id ="input-lastname")
	private WebElement lastName;
	@FindBy(id ="input-email")
	WebElement emailaddress;
	@FindBy (id = "input-telephone")
	private WebElement telephone;
	@FindBy(id = "input-password")
	private WebElement password;
	@FindBy (id = "input-confirm")
	private WebElement passwordconfirm;
	@FindBy(xpath="//input[@name='agree']")
	private WebElement agreecheckBox;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement ContinueButton;
	
	
	public WebElement FirstName() {
		
		return firstName;
	}
	
	public WebElement LastName() {
		
		return lastName;
	}
	public WebElement EmailAddress() {
		
		return emailaddress;
	}
	public WebElement Telephone() {
		
		return telephone;
	}
	public WebElement Password() {
		
		return password;
	}
	public WebElement PasswordConfirm() {
		return passwordconfirm;
	}
	public WebElement AgreeCheckBox() {
		return agreecheckBox;
	}
	public WebElement ContinueButton() {
		return ContinueButton;
	}
}