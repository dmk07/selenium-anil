package Selenium_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp30 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Mouse_Action() throws InterruptedException
	{
	actobj=new Actions(driver);
	WebElement src=driver.findElement(By.xpath("//a[text()='Desktops']"));
	WebElement des=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	Thread.sleep(2000);
	actobj.moveToElement(src).moveToElement(des).click().perform();
	
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp30 obj=new SadbasicsExp30();
		obj.LaunchAUT();
		obj.Mouse_Action();

	}

}
