package com.ca2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String args[]) {
		int checkedCheckboxes = 0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://designsystem.digital.gov/components/checkbox/");
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

		for (int i = 0; i < checkboxes.size(); i = i + 1) {
			WebElement checkbox = checkboxes.get(i);
			if (checkbox.isSelected()) {
				System.out.println("Checkbox no: " + i + " || Status: " + checkbox.isSelected());
				checkedCheckboxes++;
			} else {
				System.out.println("Checkbox no: " + i + " || Status: " + checkbox.isSelected());
			}
		}
		System.out.println("Total number of checked checkboxes: " + checkedCheckboxes + "\n");
		System.out.println("Total number of unchecked checkboxes: " + (checkboxes.size() - checkedCheckboxes) + "\n");
		System.out.println("Total number of checkboxes: " + checkboxes.size());
	}

}
