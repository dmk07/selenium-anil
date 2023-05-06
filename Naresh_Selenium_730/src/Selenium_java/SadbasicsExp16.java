package Selenium_java;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsExp16 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter browser name");
		String browser=sc.nextLine();
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("The Browser not Found");
		}
		driver.get("https://www.army.mil/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp16 obj=new SadbasicsExp16();
		obj.LaunchAUT();

	}

}
