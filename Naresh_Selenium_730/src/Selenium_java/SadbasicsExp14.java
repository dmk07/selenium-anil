package Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SadbasicsExp14 {

	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void Senddata() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp14 obj=new SadbasicsExp14();
		obj.LaunchAUT();
		obj.Senddata();


	}

}
