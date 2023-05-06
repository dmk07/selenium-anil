package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp7 {
	public void LaunchAUT() throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Mr Anil please provide your Appli URL's");
		String url=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
	//	driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp7 obj=new SadbasicsExp7();
		obj.LaunchAUT();

	}

}
