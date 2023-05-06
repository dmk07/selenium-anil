package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp8 {
	public void LaunchAUT() throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many times need to execute your application");
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp8 obj=new SadbasicsExp8();
		obj.LaunchAUT();

	}

}
