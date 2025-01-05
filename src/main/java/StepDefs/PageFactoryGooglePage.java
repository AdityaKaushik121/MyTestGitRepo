package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactoryExampleImpl.PageFactoryImplementations;
import io.cucumber.java.en.When;

public class PageFactoryGooglePage {

	WebDriver driver=null;
	PageFactoryImplementations gog;
	@When("I hit the url")
	public void iHitUrl(){
		driver= new ChromeDriver();
		driver.get("https://google.com");
	}
	@When("I send {string} in search box and click enter")
	public void performSearch(String searchTxt) {
		gog=new PageFactoryImplementations(driver);
		gog.searchGoolge(searchTxt);
	}
	
}
