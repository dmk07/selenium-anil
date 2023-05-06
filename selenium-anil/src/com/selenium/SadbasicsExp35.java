package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp35 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (21)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		
	}

	public void Refresh() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("history.go(0);");
		Thread.sleep(2000);
	}
	public void Get_pageSRC() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		String data=jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("The page SRC:"+data);
		Thread.sleep(2000);
	}
	public void Alert() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("alert('WelCome to Amazon mr. Anil');");
		Thread.sleep(3000);
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp35 obj=new SadbasicsExp35();
		obj.LaunchAUT();
		obj.Get_pageSRC();
		obj.Refresh();
		obj.Alert();

	}

}
