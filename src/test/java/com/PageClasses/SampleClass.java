package com.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleClass {

	@Test
	public static void loginModule() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SudhaMani\\SMK_Documents\\SoftwareTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Launching Browser
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pass@1234");

	}

}
