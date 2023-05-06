package com.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SadbasicsExp31 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (21)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Explicit_wait()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Beauty']")));
		we.click();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp31 obj=new SadbasicsExp31();
		obj.LaunchAUT();
		obj.Explicit_wait();

	}

}
