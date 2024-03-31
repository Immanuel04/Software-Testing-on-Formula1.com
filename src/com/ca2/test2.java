package com.ca2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class test2 {

   	 public static void main(String args[]) {
   		 WebDriver driver=new ChromeDriver();                             
   		 driver.get("https://www.formula1.com/en/latest.html");
   		 List<WebElement> links =driver.findElements(By.tagName("a"));
   		 System.out.println("Total links: " + links.size());
   		 for(int i = 0; i < links.size(); i = i+1) {
   		        System.out.println("Link" + i + "LinkName" + links.get(i).getText());
   		 }
       }
    }

