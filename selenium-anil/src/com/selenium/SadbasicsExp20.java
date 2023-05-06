package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SadbasicsExp20 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Sendata() throws InterruptedException
	{
		driver.findElement(By.name("UserFirstName")).sendKeys("Anil");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("anilkumartesting22@gmail.com");
		Thread.sleep(2000);
		
	}
	public void Job_DropDown() throws InterruptedException
	{
		//pick the dropdown locater
		WebElement job_title=driver.findElement(By.name("UserTitle"));
		//Create select method 
		Select slcobj=new Select(job_title);
		slcobj.selectByVisibleText("Marketing / PR Manager");
		Thread.sleep(2000);
		slcobj.selectByIndex(3);
		Thread.sleep(2000);

	}
	public void Company_name() throws InterruptedException
	{
		driver.findElement(By.name("CompanyName")).sendKeys("CSS");
		Thread.sleep(2000);
		WebElement Employees=driver.findElement(By.name("CompanyEmployees"));
		Select slcobj2=new Select(Employees);
		slcobj2.selectByIndex(3);
		Thread.sleep(2000);
		slcobj2.selectByVisibleText("16 - 100 employees");
		Thread.sleep(2000);
		driver.findElement(By.name("UserPhone")).sendKeys("901063429");
		Thread.sleep(2000);
		
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp20 obj=new SadbasicsExp20();
		obj.LaunchAUT();
		obj.Sendata();
		obj.Job_DropDown();
		obj.Company_name();

	}

}
