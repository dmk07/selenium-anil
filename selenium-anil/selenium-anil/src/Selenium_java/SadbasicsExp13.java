package Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp13 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Senddata(String Uname, String Password) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(Uname);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp13 obj=new SadbasicsExp13();
		obj.LaunchAUT();
		obj.Senddata("anilkumar12@gmail.com", "pasqwe");
		obj.Senddata("123@sales.com", "anil5432");
		obj.Senddata("anil12@gmail.com", "Prabhudev");

	}

}
