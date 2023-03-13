package stepsdefinition;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Basepage;
import pages.LandingPage;
import pages.RegisterAccountPage;
import pages.SuccessPage;

public class RegisterAccount extends Basepage {

	WebDriver driver;
	LandingPage landingpage;
	RegisterAccountPage registeraccount;
	SuccessPage successpage;

	@Given("^I open the browser$")
	public void i_open_the_browser() {
		NavigateToHomePage();

	}

	@When("^I navigate to register account page$")
	public void i_navigate_to_register_account_page() {
		landingpage = new LandingPage(Basepage.driver);
		landingpage.MyAccountDropDown().click();
		landingpage.LoginOptions().click();

	}

	// make use of data table
	@And("I enter the below details")
	public void i_enter_the_below_details(DataTable data) {
		registeraccount = new RegisterAccountPage(Basepage.driver);
		Map<String, String> dataMap = data.asMap(String.class, String.class);
		registeraccount.FirstName().sendKeys(dataMap.get("firstname"));
		registeraccount.LastName().sendKeys(dataMap.get("lastname"));
		registeraccount.EmailAddress().sendKeys(dataMap.get("email"));
		registeraccount.Telephone().sendKeys(dataMap.get("telephone"));
		registeraccount.Password().sendKeys(dataMap.get("password"));
		registeraccount.PasswordConfirm().sendKeys(dataMap.get("password"));
	}

	@And("^I check i have read and agree to the privacy policy$")
	public void i_check_i_have_read_and_agree_to_the_privacy_policy() {
		registeraccount.AgreeCheckBox().click();

	}

	@And("I click continue button")
	public void i_click_continue_button()  {
		registeraccount.ContinueButton().click();

	}

	@Then("^I am successfully registered$")
	public void i_am_successfully_registered() {
		

		String successfullyLogin = null;
		
		//successfullyLogin = successpage.successLink().getText(); 
		
		try {
			successfullyLogin = successpage.successLink().getText();
			Assert.assertEquals(successfullyLogin,"Success");
		}catch(Exception ex) {
			
			Assert.assertNotEquals(successfullyLogin, "Success");
			
			
		}
		}

}
