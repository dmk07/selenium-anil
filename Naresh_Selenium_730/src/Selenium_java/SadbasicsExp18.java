package Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsExp18 {
	WebDriver driver;
	String bro1="chrome";
	String bro2="firefox";
	public void LaunchAUT() throws InterruptedException
	{
		SadbasicsExp18 obj=new SadbasicsExp18();
		if(obj.bro1.equals("chrome"))
		{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (23)\\chromedriver.exe");
         driver=new ChromeDriver();
         driver.get("https://login.salesforce.com/?locale=in");
 		Thread.sleep(2000);
 		driver.manage().window().maximize();
		}
		if(obj.bro2.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			Thread.sleep(2000);
			driver.manage().window().maximize();	
			
		}
		else
		{
			System.out.println("Browser not found");
		}
	
		
	}


	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp18 obj=new SadbasicsExp18();
		obj.LaunchAUT();
	}

}
