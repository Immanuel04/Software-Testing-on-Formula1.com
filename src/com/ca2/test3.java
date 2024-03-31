package com.ca2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.*;

public class test3 {
	
	  public static void main(String args[]) {
		  int checkedCheckboxes = 0;
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.f1authentics.com/collections/sergio-perez?filter.p.product_type=Bodywork+and+Photo&filter.p.product_type=F1+Car+1%3A8+Scale&filter.p.product_type=Rear+Wing+Endplate");
		  List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		  
		  for(int i = 0; i < checkboxes.size(); i = i+1) {
			  WebElement checkbox = checkboxes.get(i);

			  if(checkbox.isSelected()) {
				  System.out.println("Checkbox no: " + i + " || Status: " + checkbox.isSelected());
				  checkedCheckboxes++ ;		
				  }
			  else {
				  System.out.println("Checkbox no: " + i + " || Status: " + checkbox.isSelected());
				  
			  }
		  }
		  System.out.println("Total number of checked checkboxes: " + checkedCheckboxes + "\n");
		  System.out.println("Total number of unchecked checkboxes: " + (checkboxes.size() - checkedCheckboxes) + "\n");
		  System.out.println("Total number of checkboxes: " + checkboxes.size());
		   }
}
