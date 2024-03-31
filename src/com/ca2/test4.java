package com.ca2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/FormulaHub/login.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.id("submit")).click();
		System.out.println(driver);
		System.out.println("Welcome Admin");

	}

}
