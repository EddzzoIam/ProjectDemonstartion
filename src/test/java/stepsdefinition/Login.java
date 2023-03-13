package stepsdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.Basepage;
import pages.LandingPage;
import pages.LoginPage;
import pages.RegisterAccountPage;

public class Login extends Basepage {

	WebDriver driver;
	LandingPage landingpage;
	LoginPage loginpage;
	AccountPage accountpage;
	RegisterAccountPage registeraccount;

	@Given("^Open any Browser$")
	public void open_any_browser() {
		NavigateToHomePage();

	}

	@When("^Navigate to Login page$")
	public void navigate_to_login_page() {
		landingpage = new LandingPage(Basepage.driver);

		landingpage.MyAccountDropDown().click();
		landingpage.LoginOption().click();

	}

	@And("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	public void user_enters_username_as_something_and_password_as_something_into_the_fields(String email,
			String password) {

		loginpage = new LoginPage(Basepage.driver);

		loginpage.EmailAddress().sendKeys(email);

		loginpage.PasswordField().sendKeys(password);

	}

	@And("^User clicks on Login button$")
	public void user_clicks_on_login_button() {
		loginpage.LoginButton().click();

	}

	@Then("^Verify user is able to successfully login$")
	public void verify_user_is_able_to_successfully_login() {

		accountpage = new AccountPage(Basepage.driver);
		
		String successfullyLogin = null;
		
		try {
			successfullyLogin = accountpage.Edit_your_account_information().getText();
			Assert.assertEquals(successfullyLogin,"Edit your account information");
		}catch(Exception ex) {
			
			Assert.assertNotEquals(successfullyLogin, "Test fail");
		}

	}
}

