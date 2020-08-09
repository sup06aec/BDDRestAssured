package helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources"+"/TestData/config.properties");
			prop.load(fis);
		}catch (FileNotFoundException exp) {
			
		}catch (IOException exp) {
			
		}
	}
		
		public static void initialization() throws IOException {
			String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				//System.setProperty("webdriver.chrome.driver", "C:/Supriya/Drivers/chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
				else if(browserName.equals("FF")) {
				System.setProperty("webdriver.geko.driver", "C:/Supriya/driver/gekodriver");
				driver = new FirefoxDriver();	
				}
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				System.out.println( "the url is "+prop.getProperty("url"));
				driver.get(prop.getProperty("url"));
				
			}
	

}
