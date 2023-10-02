package com.java.selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {

   WebDriverManager.chromedriver().setup();
   ChromeDriver driver = new ChromeDriver();
   driver.get("https://www.ebay.com.au/");
   driver.manage().window().maximize();
	}

}
