package Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp25 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		actobj=new Actions(driver);
		actobj.sendKeys(Keys.ESCAPE).build().perform();
	}
	public void Senddata() throws InterruptedException
	{
		WebElement we=driver.findElement(By.name("q"));
		actobj=new Actions(driver);
		actobj.sendKeys(we,"selenium").perform();
		Thread.sleep(2000);
		actobj.sendKeys(Keys.ENTER).perform();
		String data=driver.getPageSource();
		if(data.contains("selenium"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("testcase fail");
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp25 obj=new SadbasicsExp25();
		obj.LaunchAUT();
		obj.Senddata();
	}

}
