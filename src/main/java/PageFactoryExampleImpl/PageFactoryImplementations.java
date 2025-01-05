package PageFactoryExampleImpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryImplementations {

	WebDriver driver;
	@FindBy(xpath = "//*[@title='Search']")
	WebElement seachText;

	@FindBy(xpath = "(//input[@type='submit' and @value='Google Search' and @class='gNO89b'])[2]")
	WebElement button;

	public PageFactoryImplementations(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void searchGoolge(String str) {
		seachText.clear();
		seachText.sendKeys(str);
		button.click();
	}

}
