package stepDefinitions;



import cucumber.api.java.en.*;
import helpers.TestBase;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomePageSteps extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	   TestBase.initialization();
	}

	@Then("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		loginPage= new LoginPage();
		String verifyWelcomeText = loginPage.verifyWelcomeText();
	System.out.println("The welcome message in login page is "+verifyWelcomeText);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		loginPage.setUserName(prop.getProperty("username"));
		loginPage.setPassword(prop.getProperty("password"));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		homePage = loginPage.clickLogin();
	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		String pageHeader = homePage.verifyPageHeader();
		System.err.println("the page header is "+pageHeader);
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String hometitle = homePage.verifyHomePageTitle();
		System.out.println("The title of the home page is"+ hometitle);
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
	    driver.quit();
	}
}
