package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp6 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void Sendata() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(" i phone");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp6 obj=new SadbasicsExp6();
		obj.LaunchAUT();
		obj.Sendata();

	}

}
