package stepDefs;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddProductPage;

public class stepdef {
	AndroidDriver driver = Hooks.driver;
    AddProductPage ap;
	

	@Given("As a user I will access Amazon application")
	public void as_a_user_i_will_access_amazon_application() {
		ap = new AddProductPage(driver);
		ap.ClicklangBtn();
		ap.ClicklangContBtn();
		ap.ClickskipBtn();

	}

	@When("I identify search location")
	public void i_identify_search_location() {
       ap.ClickSearchBtn();
	}

	@When("I will pass the product in it")
	public void i_will_pass_the_product_in_it() {
       ap.ClickInputBtn();
	}

	@When("select the prodcut to cart")
	public void select_the_prodcut_to_cart() throws InterruptedException {
		ap.ItemsList();
		ap.ClickOnProduct();

	}



}
