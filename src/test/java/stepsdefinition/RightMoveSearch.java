package stepsdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Basepage;
import pages.LandingPage;
import pages.SearchPage;

public class RightMoveSearch extends Basepage {
	WebDriver driver;
	LandingPage landingpage;
	SearchPage searchpage;

	@Given("I navigate to home page")
	public void i_navigate_to_home_page() throws Exception  {
		HomePage();
		Thread.sleep(3000);
		landingpage = new LandingPage(Basepage.driver);
		landingpage.cookiesButton().click();

	}

	@When("I enter {string} into location")
	public void i_enter_into_location(String loc) {
		landingpage.searchBox().sendKeys(loc);
		// landingpage.autoComplete().get(0).click();

	}

	@And("I click  for sale")
	public void i_click_for_sale() {
		landingpage.saleButton().click();

	}

	@And("I select {string} as search radious")
	public void i_select_as_search_radious(String rad) {
		 searchpage = new SearchPage(Basepage.driver);
	//	searchpage.radiusClick().click();
		searchpage.radiusDistance(rad);

	}

	@And("I select {string} as minimum price")
	public void i_select_as_minimum_price(String minPrice) throws Exception  {
		Thread.sleep(3000);
		searchpage.minimumPrice(minPrice);

	}

	@And("I select {string} as maximum price")
	public void i_select_as_maximum_price(String maxPrice) throws Exception {
		Thread.sleep(3000);
		searchpage.maximumPrice(maxPrice);
	}

	@And("I select {string} as minimum bed")
	public void i_select_as_minimum_bed(String minBed) throws Exception  {
		Thread.sleep(3000);
		searchpage.miniumBed(minBed);

	}

	@And("I select {string} as maximum bed")
	public void i_select_as_maximum_bed(String maxBed) throws Exception  {
		Thread.sleep(3000);
		searchpage.maximumBed(maxBed);
		

	}

	@And("I select {string} as property type")
	public void i_select_semi_detached_as_property_type(String types) {
		searchpage.propTypes(types);

	}

	@And("I select {string} as added on site")
	public void i_select_as_added_on_site(String time) {
		searchpage.sinceAdded(time);

	}

	@And("I click on search button")
	public void i_click_on_search_button() {
		searchpage.searchProperty().click();

	}

	@Then("I am on search result page")
	public void i_am_on_search_result_page() {

	}

}
