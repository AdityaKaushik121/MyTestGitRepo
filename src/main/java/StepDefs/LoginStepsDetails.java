package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginStepsDetails {
	
	WebDriver driver=new ChromeDriver();
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
	    System.out.println("Inside metod 1");
	}

	@When("The user is trying to enter user name as {string}")
	public void the_user_is_trying_to_enter_user_name_as(String string) {
		System.out.println("Inside metod 2");
	}

	@When("The user enter password as {string}")
	public void the_user_enter_password_as(String string) {
		System.out.println("Inside metod 3");
	}

	@When("The login button is clicked")
	public void the_login_button_is_clicked() {
		System.out.println("Inside metod 4");
	}

	@Then("Login should be successful")
	public void login_should_be_successful() {
		System.out.println("Inside metod 5");
	}

	@When("The user enter adi on login field")
	public void the_user_enter_adi_on_login_field() {
		System.out.println("Inside metod 6");
	}

	@When("The user enter {int} on password field")
	public void the_user_enter_on_password_field(Integer int1) {
		System.out.println("Inside metod 7");
	}

	@When("The user enter pqr on login field")
	public void the_user_enter_pqr_on_login_field() {
		System.out.println("Inside metod 7");
	}


}
