package runner_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericScript.Base_Test;
import genericScript.Datadriven;
import pom_script.Pomsc;

public class Runner extends Base_Test {
	@Test
	public void diatoz() throws InterruptedException, EncryptedDocumentException, IOException
	{
		//FETCHING THE DATA
		Pomsc p=new Pomsc(driver);
		String s = Datadriven.getData("Sheet1", 0, 0);
		p.titlename().sendKeys(s);
		String s1 = Datadriven.getData("Sheet1", 0, 1);
		p.email1().sendKeys(s1);
		String s2 = Datadriven.getData("Sheet1", 0, 2);
		p.description().sendKeys(s2);
		//ASSERTURL
		String title = driver.getCurrentUrl();
		Assert.assertEquals(title, "https://diatoz.com/data-science/products/hr-analytics");
		
		//NAVIGATE TO HOME
		driver.findElement(By.xpath("//a[@class='navbar-brand mobile']//img[@alt='DIATOZ Logo']")).click();
		//ASSERTURL
		String title1 = driver.getCurrentUrl();
		Assert.assertEquals(title1, "https://diatoz.com/data-science/products/hr-analytics");
		Thread.sleep(4000);
		
		//NAVIGATE TO CONTACTUS
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<2;i++)
		{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		}	
		String n = Datadriven.getData("Sheet1", 1, 0);
		p.name().sendKeys(n);
		String c = Datadriven.getData("Sheet1", 1, 1);
		p.contact().sendKeys(c);
		String e = Datadriven.getData("Sheet1", 1, 2);
		p.email2().sendKeys(e);
		String d = Datadriven.getData("Sheet1", 1, 3);
		p.dsecri().sendKeys(d);
	}

}
