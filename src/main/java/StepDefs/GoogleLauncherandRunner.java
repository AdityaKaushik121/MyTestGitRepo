package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.*;


public class GoogleLauncherandRunner {
	
	WebDriver driver=null;

	@Given("Google home page is launched and displayed")
	public void google_home_page_is_launched_and_displayed() {
	   driver=new ChromeDriver();
	   driver.get("https://www.google.com");
	}

	@When("I enter Selenium in google search bar")
	public void i_enter_selenium_in_google_search_bar() {
		GoogleHomePage ghm=new GoogleHomePage(driver);
		ghm.search("Hello");
	}

	@When("I click enter")
	public void i_click_enter() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I see result open")
	public void i_see_result_open() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	}
}
