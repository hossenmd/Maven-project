package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
    private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static int Timeout =30;
	public final static int Page_Load_Timeout =50;

	private SeleniumDriver() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\BTC_180927E\\workspace 01292019\\CucumberPageObjects\\src\\test\\resources\\Executables\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver,Timeout);
		driver.manage().timeouts().implicitlyWait(Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Page_Load_Timeout, TimeUnit.SECONDS);

	
	}

	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;

	}

	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();

		}
	}

   public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}


		seleniumDriver=null;

}
}
