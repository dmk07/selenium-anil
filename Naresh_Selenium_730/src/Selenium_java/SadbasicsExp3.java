package Selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp3 {
	public void LuanchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");//get()
		//lets wait sometime
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//close the active window on the browser
		Thread.sleep(2000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp3 obj=new SadbasicsExp3();
		obj.LuanchAUT();

	}

}
