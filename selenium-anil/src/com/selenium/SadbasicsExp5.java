package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp5 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void get_pageURL()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	public void get_PageSRC()
	{
		String SRC=driver.getPageSource();
		System.out.println(SRC);
		
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp5 obj=new SadbasicsExp5();
		obj.LaunchAUT();
		obj.get_PageSRC();
		obj.get_pageURL();

	}

}
