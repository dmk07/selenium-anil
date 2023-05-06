package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp22 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Senddata() throws InterruptedException
	{
		//send data by using CssSelector
		//Tag and Id
		driver.findElement(By.cssSelector("#email")).sendKeys("Mdariz");
		Thread.sleep(2000);
		//Tag and Id
		driver.findElement(By.cssSelector("#pass")).sendKeys("Suman");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=login]")).click();
	}
	

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp22 obj=new SadbasicsExp22();
		obj.LaunchAUT();
		obj.Senddata();

	}

}
