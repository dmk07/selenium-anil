package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp28 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	 public void RightClick() throws InterruptedException
	 {
		actobj=new Actions(driver);
		WebElement right= driver.findElement(By.xpath("//a[text()='Mobiles']"));
		actobj.contextClick(right).build().perform();
		Thread.sleep(2000);
	 }

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp28 obj=new SadbasicsExp28();
		obj.LaunchAUT();
		obj.RightClick();

	}

}
