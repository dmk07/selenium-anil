package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp2 {
	public void LaunchAUT()
	{
		//driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		//intilaize driver object
		WebDriver driver=new ChromeDriver();
		//launch the application URL
		driver.get("https://www.amazon.in/");
		//how to handle the Active window convert min to max
		driver.manage().window().maximize();

	}

	public static void main(String[] args) {
		SadbasicsExp2 obj=new SadbasicsExp2();
		obj.LaunchAUT();

	}

}
