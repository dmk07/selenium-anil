package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsExp12 { 
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void Senddata() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp12 obj=new SadbasicsExp12();
		obj.LaunchAUT();
		obj.Senddata();

	}

}
