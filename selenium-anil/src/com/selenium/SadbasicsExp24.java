package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp24 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}
	public void Multiwindow() throws InterruptedException
	{
		String P_wind=driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Admin area')]")).click();
	    Thread.sleep(2000);
	   Set<String>allwindows=driver.getWindowHandles();
	   //need to make for each
	   for(String handle:allwindows)
	   {
		   if(!handle.equals(P_wind))
		   { 
			   driver.switchTo().window(handle);
			   driver.findElement(By.cssSelector("input#Email")).clear();
			   Thread.sleep(1000);
			   driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
			   Thread.sleep(1000);
			   driver.findElement(By.name("Password")).clear();
			   Thread.sleep(1000);
			   driver.findElement(By.name("Password")).sendKeys("admin");
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//button[text()='Log in']")).click();
			   
		   }
	   }
	}
	   public void CloseAUT()
	   {
		   driver.quit();
	   }
	
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp24 obj=new SadbasicsExp24();
		obj.LaunchAUT();
		obj.Multiwindow();
		obj.CloseAUT();
	}

}
