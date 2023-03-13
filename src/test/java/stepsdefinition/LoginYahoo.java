package stepsdefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Basepage;
import pages.LandingPage;

public class LoginYahoo extends Basepage {

	WebDriver driver;
	LandingPage landingpage;

	@Given("^I navigate to google home page$")
	public void i_navigate_to_google_home_page() {

		GoogleHomePage();
	}

	@When("I enter yahoo into the google search field and i click")
	public void i_enter_yahoo_into_the_google_search_field_and_i_click() throws Exception {
		landingpage = new LandingPage(Basepage.driver);
		Thread.sleep(3000);
		landingpage.cookiepolicy().click();
		landingpage.googleSearch().sendKeys("yahoo login");
		landingpage.googleSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		// landingpage.googleSearchButton().sendKeys(Keys.ENTER);

	}

	@And("I sign in")
	public void i_sign_in() {
		
		landingpage.yahooLogin().click();
	}

	@And("I enter username as {string} into email field")
	public void i_enter_username_as_endurance_osemwonta_yahoo_com_into_email_field(String username) throws InterruptedException {
		
		landingpage.UserName().sendKeys(username);
		Thread.sleep(2000);
		landingpage.signButton().click();

	}

	@And("I enter {string} into password field")
	public void i_enter_into_password_field(String password) {

	}

	@And("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {

	}

	@Then("Am able to successefully sign in")
	public void am_able_to_successefully_sign_in() {

	}

}
