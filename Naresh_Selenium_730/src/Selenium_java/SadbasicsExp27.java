package Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp27 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (18)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Double_Click() throws InterruptedException
	{
		driver.switchTo().frame("iframeResult");
		WebElement doubl_Click=driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		Thread.sleep(1000);
		actobj=new Actions(driver);
		actobj.doubleClick(doubl_Click).build().perform();	
	}
	public void Get_Text()
	{
		String we=driver.findElement(By.xpath("//p[text()='Hello World ']")).getText();
		System.out.println(we);
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp27 obj=new SadbasicsExp27();
		obj.LaunchAUT();
		obj.Double_Click();
		obj.Get_Text();

	}

}
