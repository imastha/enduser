package radiologistPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Radio_Login_Page {

	WebDriver driver;
	public Radio_Login_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='lg_username']")
	private WebElement usernameTextbox;

	@FindBy(xpath = "//input[@id='lg_password']")
	private WebElement passwordTextbox;
	
	@FindBy(xpath = "//input[@id='login-submit']")
	private WebElement signInButton;

	@FindBy(xpath = "//button[@id='forgetBtn']")
	private WebElement forgotpwdbtn;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement forgotpwdusername;
	
	public void login_with_valid_username_password(String username, String password, String role, SoftAssert Assert)
			throws Throwable {

		//driver.get("https://ecollabdds.ehospital.nic.in/management/login");
		Thread.sleep(2000);
		usernameTextbox.sendKeys("myradiouser");
		passwordTextbox.sendKeys("Demo@2020");
		Thread.sleep(10000);
		signInButton.click();
		Thread.sleep(2000);
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl, "https://ecollabdds.ehospital.nic.in/management/enduserdashboard", "Fail: Login_with_valid_username_password");
		
}
}