package com.businessscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestTwo {
	@Test
public static void testTwo() throws InterruptedException {

//	System.setProperty("", "");
System.out.println("Person2 Modifications......");
System.out.println("Person1 Modifications......");
System.out.println("Person1 Modifications......");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser launched successfully...");
	driver.manage().window().maximize();
	System.out.println("Maximized the browser...");
	driver.get("https://www.flipkart.com");
	System.out.println("Navigated to "+driver.getCurrentUrl());
	Thread.sleep(5000);
	driver.close();

}
}
