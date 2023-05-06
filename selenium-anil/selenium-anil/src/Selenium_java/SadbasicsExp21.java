package Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp21 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Click_Ok() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		//switch to alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	public void Click_Cancel() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	}
	public void Senddata() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("anilkumartesting22@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	public void Get_Text() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		String data=driver.switchTo().alert().getText();
		System.out.println("The data is:"+data);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public void CloseAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp21 obj=new SadbasicsExp21();
		obj.LaunchAUT();
		obj.Click_Ok();
		obj.Click_Cancel();
		obj.Senddata();
		obj.Get_Text();
		obj.CloseAUT();
		int  a=45;
	}

}
