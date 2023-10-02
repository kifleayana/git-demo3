package com.java.selenium.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoAutomation {
   
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../selenium-java-automation/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
