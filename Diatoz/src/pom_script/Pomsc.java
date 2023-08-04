package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericScript.Page_Pom;

public class Pomsc extends Page_Pom{
	@FindBy(xpath="//input[@name='title']")
	private WebElement title;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@placeholder='Case Description']")
	private WebElement desc;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement na;
	
	@FindBy(xpath="//input[@placeholder='Phone']")
	private WebElement con;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement em;
	
	@FindBy(xpath="//textarea[@placeholder='Description']")
	private WebElement dsc;
	
	public Pomsc(WebDriver driver)
	{
		super(driver);
	}
	public WebElement titlename()
	{
		return title;
	}
	public WebElement email1()
	{
		 return email;
	}
	public WebElement description(	)
	{
		return desc;
	}
	
	public WebElement name()
	{
		 return na;
	}
	public WebElement contact()
	{
		 return con;
	}
	public WebElement email2()
	{
		 return em;
	}
	public WebElement dsecri()
	{
		 return dsc;
	}
	
}
