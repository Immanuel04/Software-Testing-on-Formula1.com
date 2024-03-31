package com.ca2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/FormulaHub/index.jsp");

		// Assuming the login button has an id attribute, change "loginButtonId" to the
		// actual id
		WebElement loginButton = driver.findElement(By.id("register-btn"));
		if (loginButton != null) {
			System.out.println("Register button found!");
		} else {
			System.out.println("Register button not found!");
		}
		driver.quit();
	}
}
