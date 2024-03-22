package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppLoginTest {

	WebDriver driver = new ChromeDriver();
	ExtentTest testCase;
	String ExpectedText = "Hello vasuvespag";
	
	@Given("I am on HotelApp login page")
	public void i_am_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.navigate().to("http://adactinhotelapp.com/");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user clicks Sign in button")
	public void user_clicks_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
	}
	@Then("user gets login successful message")
	public void user_gets_login_successful_message() {
	    // Write code here that turns the phrase above into concrete actions
		String actualText = driver.findElement(By.id("username_show")).getAttribute("value");
		
	}
	
	@When("user enter location as {string}")
	public void user_enter_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement l = driver.findElement(By.id("location"));
        Select location = new Select(l);
        location.selectByValue(string);

	}

	@When("user enter Hotels as {string}")
	public void user_enter_hotels_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement h = driver.findElement(By.id("hotels"));
        Select hotel = new Select(h);
        hotel.selectByValue(string);
	}

	@When("user enter Room type as {string}")
	public void user_enter_room_type_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement r = driver.findElement(By.id("room_type"));
        Select roomtype = new Select(r);
        roomtype.selectByValue(string);
	}

	@When("user clicks on Search in button")
	public void user_clicks_on_search_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement s = driver.findElement(By.id("Submit"));
        s.click();
	}
	@Then("user gets next select hotel webpage")
	public void user_gets_next_select_hotel_webpage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}




}
