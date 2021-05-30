package com.businessscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	@Test
	public static void testOne() throws InterruptedException {
//		System.setProperty("", "");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully...");
		driver.manage().window().maximize();
		System.out.println("Maximized the browser...");
		driver.get("https://www.rameshsoft.com");
		System.out.println("Navigated to "+driver.getCurrentUrl());
		Thread.sleep(5000);
		System.out.println("Person2 changes....");
		driver.close();
	}

}
