	package base;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class BaseTest {
	    protected static WebDriver driver;
	
	    public static void startDriver() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }
	
	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	
	    public static WebDriver getDriver() {
	        return driver;
	    }
	}
