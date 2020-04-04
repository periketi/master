package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Feature_Test {
	WebDriver driver = null;

	@Given("^Open URL$")
	public void open_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagasri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8888/emp/200");
	}

	@When("^Enter Username Password$")
	public void enter_Username_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^validate User$")
	public void validate_User() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^Login$")
	public void login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^Throw Error$")
	public void throw_Error() throws Throwable {
		driver.findElement(By.id("id1")).sendKeys("");
		driver.findElement(By.xpath("id2")).sendKeys("");
		driver.findElement(By.name("id3")).sendKeys("");
		driver.findElement(By.id("id1")).click();
		driver.findElement(By.xpath("id2")).click();
		driver.findElement(By.name("id3")).click();
		driver.findElement(By.className("class"));
	}
}
