package com.java.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		//step 1: launch the chrome webdriver as below
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kifle\\eclipse\\java-2023-066\\eclipse\\selenium-java-automation\\Drivers\\chromedriver.exe");
// System.setProperty is used to launch the automation web driver and takes two arguments:the webdriver.chrome.driver(browser type) and its Location
		// Step 2: Create the object of the chrome webdriver as follows
		ChromeDriver driver = new ChromeDriver();// with the cursor,hoover over Chromedriver and import org.openqa.selenium.chrome.chromedriver
		// step 3: Open the url from the get method of the class driver
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
		// id and name locators are used as below:
		//driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");//sometimes we might use some elements like search many times;hence we need 
		//to create a variable to store the values as follows:
		//WebElement searchbox = driver.findElement(By.id("search_query_top"));
		//searchbox.sendKeys("T-Shirts");
		//driver.findElement(By.name("submit_search")).click();
		
		
		// How to use the linkText to identify an Element on a web application:
		//driver.findElement(By.linkText("Printed Dress")).click();
		//driver.findElement(By.partialLinkText(" Dress")).click();
		//driver.findElement(By.linkText("Casual Dress")).click();
		// in HTML, UL Stands for user list & LI stands for list item.
		
		// using "class" and "tag name" to find elements:// we use these two locators to find multiple elements on a webpage
		
		
		
		//driver.findElement(By.name("submit_search")).click();
	;
	}

}
