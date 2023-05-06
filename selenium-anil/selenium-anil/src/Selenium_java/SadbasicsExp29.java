package Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp29 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void get_exp_text() throws InterruptedException
	{
		actobj=new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");
//		actobj.sendKeys(Keys.DOWN).perform();
//		actobj.sendKeys(Keys.DOWN).perform();
//		actobj.sendKeys(Keys.DOWN).perform();
//		actobj.sendKeys(Keys.DOWN).perform();
//		actobj.sendKeys(Keys.DOWN).perform();
//		actobj.sendKeys(Keys.DOWN).perform();
		for(int i=1;i<=6;i++)
		{
			actobj.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
		}
		actobj.sendKeys(Keys.ENTER).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp29 obj=new SadbasicsExp29();
		obj.LaunchAUT();
		obj.get_exp_text();

	}

}
