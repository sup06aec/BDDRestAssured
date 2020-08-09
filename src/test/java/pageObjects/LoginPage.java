package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import helpers.TestBase;

public class LoginPage extends TestBase{
	
	

	    public LoginPage() {
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(xpath="//strong[contains(text(), 'Welcome, please sign in!')]")
	    @CacheLookup
	    WebElement SignPageWlcmText;
	    
	    @FindBy(id = "Email")
	    @CacheLookup
	    WebElement txtEmail;

	    @FindBy(id = "Password")
	    @CacheLookup
	    WebElement txtPassword;

	    @FindBy(xpath = "//input[@value='Log in']")
	    @CacheLookup
	    WebElement btnLogin;

	    @FindBy(linkText = "Logout")
	    @CacheLookup
	    WebElement lnkLogout;


	    public void setUserName(String uname) {
	        txtEmail.clear();
	        txtEmail.sendKeys(uname);

	    }

	    public String verifyWelcomeText() {
	    	return SignPageWlcmText.getText();
	    	
	    }
	    
	    public void setPassword(String pwd) {
	        txtPassword.clear();
	        txtPassword.sendKeys(pwd);
	    }

	    public HomePage clickLogin() {
	        btnLogin.click();
	        return new HomePage();
	    }

	    public void clickLogout() {
	        lnkLogout.click();
	    }


}
