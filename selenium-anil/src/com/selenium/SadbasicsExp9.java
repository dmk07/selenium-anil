package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp9 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Application URL");
		String url=sc.nextLine();
		
		System.out.println("please Enter the application Exp_title");
		String Exp_title=sc.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String act_title=driver.getTitle();
		System.out.println();
		
		if(act_title.equalsIgnoreCase(Exp_title))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("testcase is fail");
		}
	}
	public void CloseAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp9 obj=new SadbasicsExp9();
		obj.LaunchAUT();
	//	obj.CloseAUT();

	}

}
