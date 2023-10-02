package com.java.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedLocators {// customized locators are preferably used to locate web elements efficiently.There are two types of customized 
	//locators in HTML designed webpages : XPATH(relative and absolute xpath) AND CSS Selector(tag & id,tag and class; tag and attribute; tag,id,class and attribute)
	// customized locators are advanced level of locators mostly used when it is impossible to locate elements by using common locators(id,name,class,linkTexts,
	//partialLinkTexts  and tagNames). CSS stands for Cascading Style Sheets . understand that tagName is always optional in CSS Selector

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kifle\\eclipse\\java-2023-066\\eclipse\\selenium-java-automation\\Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        // using input and id combination in CSS Selector method.the format is "input#id" In CSS id is always represented by #
        
        driver.findElement(By.cssSelector("input#email")).sendKeys("gurmu@yahoo.com");// understand that tagName(input in this case)is optional
        
        // tag and class combination(the format is tagName.class)
        //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Fikru@365");
        driver.findElement(By.cssSelector("input.inputtext[aria-label=Password]")).sendKeys("silver!23");
        // using combinations of tagName,class and attributes to locate an element. we use this technique when it's hard to locate an element using other combination 
        // methods.
        driver.findElement(By.cssSelector("button[name=login]")).click();
        //Note that the attributes must be placed in [] to be used as a locator in cssSelector method .
        driver.findElement(By.xpath("//*[@id='u_0_1_sV']/div/div[3]/div/div[1]/button")).click();
        
	}

}
