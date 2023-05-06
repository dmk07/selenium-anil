package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp34 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (21)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Scroll_Top_to_B() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	public void Scroll_B_T() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
	}
	public void Expected_Element() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(5000);
		WebElement we=driver.findElement(By.xpath("//img[@alt='Nivea, Vaseline, Mamaearth  Skincare Deals']"));
		we.click();
	}
	public void get_Title()
	{
		jse=(JavascriptExecutor)driver;
		//gettitle
		String data=jse.executeScript("return document.title").toString();
		System.out.println("The page title:"+data);
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp34 obj=new SadbasicsExp34();
		obj.LaunchAUT();
		obj.Scroll_Top_to_B();
		obj.Scroll_B_T();
		//obj.Expected_Element();
		//obj.get_Title();

	}

}
