package com.crm.contactTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactTest {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test(groups = "smokeTest")
	public void createContactTest() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shubham180295@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sanu180295@");
		driver.findElement(By.xpath("//button[@name='login']")).submit();
		System.out.println("execute createContactTest");
		System.out.println("login");
	}
	
	@Test(groups = "regressionTest")
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}

}
