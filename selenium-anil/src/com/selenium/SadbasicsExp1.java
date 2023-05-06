package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp1 {
	public void LaunchAUT()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	}
	//

	public static void main(String[] args) {
		SadbasicsExp1 obj=new SadbasicsExp1();
		obj.LaunchAUT();

	}

}
