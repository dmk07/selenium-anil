package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp4 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	
	}
	public void TC_01GetTitle()
	{
		String act_title=driver.getTitle();
		System.out.println(act_title);
		String exp_title="Login | Salesforce";
		if(act_title.equalsIgnoreCase(exp_title))
		{
			System.out.println("The test case pass");
		}
		else
		{
			System.out.println("The test case fail");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp4 obj=new SadbasicsExp4();
		obj.LaunchAUT();
		obj.TC_01GetTitle();

	}

}
