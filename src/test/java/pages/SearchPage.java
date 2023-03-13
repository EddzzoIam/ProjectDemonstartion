package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Basepage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//select[@id='radius']")
	WebElement radiusDistance;
	@FindBy(xpath = "//select[@id='minPrice']")
	WebElement minimumPrice;

	@FindBy(xpath = "//select[@id='maxPrice']")
	WebElement maximumPrice;
	@FindBy(id = "minBedrooms")
	WebElement miniumBed;

	@FindBy(id = "maxBedrooms")
	WebElement maximumBed;

	@FindBy(id = "displayPropertyType")
	WebElement propTypes;
	@FindBy(id = "maxDaysSinceAdded")
	WebElement sinceAdded;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement searchProperty;

	public void radiusDistance(String radius) {

		selectByText(radiusDistance, radius);

	}

	public void minimumPrice(String miniPrice) {

		selectByText(minimumPrice, miniPrice);
	}

	public void maximumPrice(String maxiPrice) {

		selectByText(maximumPrice, maxiPrice);
	}

	public void miniumBed(String miniBed) {

		selectByText(miniumBed, miniBed);
	}

	public void maximumBed(String maxiBed) {

		selectByText(maximumBed, maxiBed);
	}

	public void propTypes(String PTypes) {

		selectByText(propTypes, PTypes);
	}

	public void sinceAdded(String added) {

		selectByText(sinceAdded, added);
	}
	public WebElement searchProperty() {
		
		return searchProperty;
	}
}
