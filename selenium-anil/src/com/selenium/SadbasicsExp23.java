package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SadbasicsExp23 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}
	public void Is_Multiple() throws InterruptedException
	{
		//switch to frame 
		driver.switchTo().frame("iframeResult");
		WebElement we=driver.findElement(By.id("cars"));
		Select slcobj=new Select(we);
		if(slcobj.isMultiple())
		{
			slcobj.selectByVisibleText("Audi");
			Thread.sleep(2000);
			slcobj.selectByValue("volvo");
			Thread.sleep(2000);
			List<WebElement>alloptions=slcobj.getAllSelectedOptions();
			for(int i=0;i<alloptions.size();i++)
			{
				String data=alloptions.get(i).getText();
				System.out.println("The Selected options is:"+data);
			}
			Thread.sleep(2000);
			slcobj.deselectByVisibleText("Audi");
			Thread.sleep(2000);
			slcobj.deselectAll();
		}
		else
		{
			System.out.println("this is not multi selector");
		}
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
	}
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp23 obj=new SadbasicsExp23();
		obj.LaunchAUT();
		obj.Is_Multiple();

	}

}
