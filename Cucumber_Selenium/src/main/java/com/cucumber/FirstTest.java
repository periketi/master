package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagasri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("periketiravi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("******");
		// driver.findElement(By.id("loginbutton")).click();
		if (driver.findElement(By.id("u_0_6")).isSelected()) {
			driver.findElement(By.id("u_0_6")).click();
		} else {
			driver.findElement(By.id("u_0_7")).click();
		}
	}
}
