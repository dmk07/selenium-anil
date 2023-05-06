package Selenium_java;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SadbasicsExp15 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void senddata() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("anilkumartesting22@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Anil123456");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	}
	public void getpageSRC() throws IOException
	{
		String src=driver.getPageSource();
		System.out.println("The title is:"+src);
		if(src.contains("Please enter username and password!"))
		{
			System.out.println("The testcase is Pass");
		}
		else
		{
			File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\DELL\\Desktop\\Anil.jpg");
			FileHandler.copy(Src, des);
			
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		SadbasicsExp15 obj=new SadbasicsExp15();
		obj.LaunchAUT();
		obj.senddata();
		obj.getpageSRC();

	}

}
