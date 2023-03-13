package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commons.DriverManager;

public class Basepage extends DriverManager {

	public String BASE_URL = "http://tutorialsninja.com/demo/";
	public String BASE_URL1 = "https://www.rightmove.co.uk/";
	public String BASE_URL2 = "https://www.google.com/";
	private Select select;

	public void NavigateToHomePage() {

		driver.navigate().to(BASE_URL);
	}

// RIGHTMOVE URL
	public void HomePage() {

		driver.navigate().to(BASE_URL1);

	}
	
	//google url
	public void GoogleHomePage() {

		driver.navigate().to(BASE_URL2);

	}

// reusable methods for selects
	public void selectByText(WebElement element, String text) {

		select = new Select(element);
		select.selectByVisibleText(text);

	}

	public void selectByValue(WebElement element, String value) {

		select = new Select(element);
		select.selectByValue(value);

	}

	public void selectByIndex(WebElement element, int index) {

		select = new Select(element);
		select.selectByIndex(index);

	}
}
