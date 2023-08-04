package genericScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import genericScript.Screenshot;


public class Base_Test implements Frame_Const {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() throws InterruptedException
	{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(base_url);
		//AssertURl
		String title = driver.getCurrentUrl();
		Assert.assertEquals(title, "https://diatoz.com/");
		Thread.sleep(4000);
		
		//ASSERT DIGITALIZING
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Digitalizing ']"));
		String text = ele.getText();
		System.out.println(text);
		Thread.sleep(4000);
		
		//NAVIGATE TO DROPDOWN
		WebElement ds = driver.findElement(By.xpath("//a[text()='Data Science - AI/ML']"));
		Actions a=new Actions(driver);
		a.moveToElement(ds).perform();
		driver.findElement(By.xpath("//a[text()='HR Analytics']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<2;i++)
		{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		}	
		}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		//SCREENSHOT IF TC FAILED
		if(ITestResult.FAILURE==res.getStatus())
		{
			Screenshot.getPhoto(driver);
		}
		driver.close();
	}
}
