package com.java.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kifle\\eclipse\\java-2023-066\\eclipse\\selenium-java-automation\\Drivers\\chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://www.automationpractice.pl/index.php");
     // How to use a tagName to locate multiple elements on a web page such as links."a" also known as anchor tag always represents links and can have multiple 
     //attributes.When using tagName as a locator of multiple elements make sure that you choose " driver.findElements" method and the objective here is to know the size
     // of the elements you want to inspect.see below example;Understand that anchor tag "a " is a common attribute for all links on web page
    int links = driver.findElements(By.tagName("a")).size(); // findElements method should always needs to be followed by 'size' method and stored as an integer.
	System.out.println(links);
	// using a " a class Locator: used to determine multiple elements on a web page using findElements method followed by 'size'method.note
	//that the class should have the same attributes
 int sliders =	driver.findElements(By.className("homeslider-container")).size();
	System.out.println(sliders);
	
	
	}

}
