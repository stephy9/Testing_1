package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
  static WebDriver driver;
  
	@Given("User is in the url {string}")
	public void user_is_in_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   driver = WebDriverManager.chromedriver().create();
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	   driver.get(string);
	}

	@When("User enter Username")
	public void user_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("User enter Password")
	public void user_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User logged in successfully");
	}
}
