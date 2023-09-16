package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AddProductPage {

	AndroidDriver driver;

	private By langBtn = By.xpath("//*[@content-desc='Select English']");
	private By langContBtn = By.xpath("//*[@text='Continue in English']");
	private By skipBtn = By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button");
	private By searchBtn = By.id("in.amazon.mShop.android.shopping:id/chrome_search_hint_view");
	private By inputBtn = By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text");
	private By listofItems = By.xpath("//android.widget.Button[@index='1']");
	private By searchItems = By.xpath(
			"//android.view.View[@resource-id='search']/android.view.View/android.view.View[@index=3 and @content-desc]\r\n");

	public AddProductPage(AndroidDriver driver) {
		this.driver = driver;
	}

	public void ClicklangBtn() {
		driver.findElement(langBtn).click();
	}

	public void ClicklangContBtn() {
		driver.findElement(langContBtn).click();
	}

	public void ClickskipBtn() {
		List<WebElement> skip_signin = driver.findElements(skipBtn);
		if (skip_signin.size() > 0) {
			driver.findElement(skipBtn).click();
		}

	}

	public void ClickSearchBtn() {
		driver.findElement(searchBtn).click();
	}

	public void ClickInputBtn() {
		driver.findElement(inputBtn).sendKeys("Airpods pro");

	}

	public void ItemsList() {
		List<WebElement> listItems = driver.findElements(listofItems);

		for (WebElement list : listItems) {
			System.out.println("Results are: " + list.getText());
			if (list.getText().equals("airpods pro")) {
				list.click();
				break;
			}
		}
	}

	public void ClickOnProduct() {
		List<WebElement> products = driver.findElements(searchItems);
		System.out.println(products.size());
		for (WebElement prod : products) {
			System.out.println("Products are: " + prod.getAttribute("content-desc"));
		}
	}

}
