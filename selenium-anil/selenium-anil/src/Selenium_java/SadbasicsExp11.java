package Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp11 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Senddata() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("anilkumartesting22-mngj@force.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Anil@09876");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp11 obj=new SadbasicsExp11();
		obj.LaunchAUT();
		obj.Senddata();

	}

}
