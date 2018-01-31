import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:/Users/Yeasi/Desktop/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	     driver.get("https://www.facebook.com/");
	     Thread.sleep(4000);
	     driver.quit();
	}


}
