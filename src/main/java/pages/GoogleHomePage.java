package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
	
	WebDriver driver;
	private By textSearch=By.xpath("//*[@title='Search']");
	private By searchBttn=By.xpath("(//input[@type='submit' and @value='Google Search' and @class='gNO89b'])[2]");
	
	public GoogleHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void search(String str) {
		driver.findElement(textSearch).sendKeys(str);
		driver.findElement(searchBttn).click();
	}

}
