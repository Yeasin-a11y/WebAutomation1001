import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:/selenium driver(chrome)/chromedriver_win32.exe");
WebDriver driver = new ChromeDriver ();
driver.get("https://www.google.com");
Thread.sleep(4000);
driver.quit();

	}

}
