package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.TestBase;

public class HomePage extends TestBase{
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement pageHeader;
	
	
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String verifyPageHeader() {
		return pageHeader.getText();
	}
	
}
