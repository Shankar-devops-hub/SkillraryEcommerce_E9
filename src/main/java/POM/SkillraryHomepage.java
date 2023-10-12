package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {
	
	//Declaration
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//address of skill rary demo app
	@FindBy(xpath="(//a[text()=' Skillrary Demo APP '])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	//address of search Icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;
	
	//address of cookies
	@FindBy(xpath="//a[@class='cookies']")
	private WebElement cookies;
	
	//initialization
	public SkillraryHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void gearsButton()
	{
		gearsbtn.click();
	}
	public void skillrarydemoappWebElement()
	{
		skillrarydemoapp.click();
	}
	public void searchTextfield(String data)
	{
		searchTf.sendKeys(data);
	}
	public void searchiconWebElement()
	{
		searchicon.click();
	}
	public void cookiesIcon()
	{
		cookies.click();
	}
	

}
