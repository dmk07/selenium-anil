package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp26 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void countFrame()
	{
		int count_frame=driver.findElements(By.tagName("iframe")).size();
		System.out.println(count_frame);
	}
	public void drag_Drop()
	{
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement des=driver.findElement(By.id("droppable"));
		actobj=new Actions(driver);
		actobj.dragAndDrop(src, des).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp26 obj=new SadbasicsExp26();
		obj.LaunchAUT();
		obj.countFrame();
		obj.drag_Drop();

	}

}
