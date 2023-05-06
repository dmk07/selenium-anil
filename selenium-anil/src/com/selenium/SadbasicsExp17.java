package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsExp17 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		String[] browser= {"Firefox","Chrome"};
		for(String brosers:browser)
		{
			if(brosers.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
			    driver=new ChromeDriver();
			    driver.get("https://jqueryui.com/draggable/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				Thread.sleep(7000);
				driver.close();
			   
			}
			else if(brosers.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
				 driver=new FirefoxDriver();
				 driver.get("https://jqueryui.com/draggable/");
				 driver.manage().window().maximize();
			    Thread.sleep(7000);
				driver.close();
			   
			}
			else
			{
				System.out.println("Browser not found");
			}
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp17 obj=new SadbasicsExp17();
		obj.LaunchAUT();

	}

}
