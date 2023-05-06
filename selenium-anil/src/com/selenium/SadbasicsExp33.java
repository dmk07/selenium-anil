package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp33 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (21)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Click() throws InterruptedException 
	{
		jse=(JavascriptExecutor)driver;
		WebElement login=driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();", login);
		Thread.sleep(2000);
		
	}
	public void Heilight()
	{
		jse=(JavascriptExecutor)driver;
		WebElement Heilight=driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].style='border:5px solid red';", Heilight);
	}
	
	public void Sendata() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		WebElement uname=driver.findElement(By.id("username"));
		//JSE
		jse.executeScript("arguments[0].value='anilkumartesting22@gmail.com';", uname);
		Thread.sleep(2000);
		WebElement pname=driver.findElement(By.id("password"));
		//JSE
		jse.executeScript("arguments[0].value='Naresh_IT';", pname);
		Thread.sleep(2000);
	}
	

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp33 obj=new SadbasicsExp33();
		obj.LaunchAUT();
		obj.Sendata();
		obj.Click();
		obj.Heilight();
	}

}
