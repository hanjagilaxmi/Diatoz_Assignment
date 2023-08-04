package genericScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Page_Pom {
	
	public Page_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
