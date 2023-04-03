package endUserTests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class TestBase {
	public static WebDriver driver;
	@BeforeSuite
	@Parameters({ "browser" })  
	public void EndUser_Url_should_open(String browser) throws IOException {
		try {
			Properties properties = new Properties();
			FileInputStream inputstream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\euBrowser.properties");
			properties.load(inputstream);
			String url = properties.getProperty("url");
			System.out.println("RunOn " + browser);
			if (browser.equals("chrome")) {
				System.out.println("inside chrome");
				Thread.sleep(2000);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			driver.navigate().to(url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



