package eCollabDDSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='lg_username']")
	private WebElement usernameTextbox;

	@FindBy(xpath = "//*[@id='lg_password']")
	private WebElement passwordTextbox;

	@FindBy(id = "login-submit")
	private WebElement signInButton;

	@FindBy(className = "notification")
	private WebElement loginWarning;

	@FindBy(xpath = "/html/body/div[1]/div/p")
	private WebElement userAndRole;

	public void login_with_valid_username_password(String username, String password, String role, SoftAssert Assert)
			throws Throwable {
		Thread.sleep(6000);
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		Thread.sleep(10000);
		signInButton.click();
		Thread.sleep(6000);
		String currenturl = driver.getCurrentUrl();
		if (role.equals("ADMIN"))
			Assert.assertEquals(currenturl, "https://ecollabdds.ehospital.nic.in/management/show",
					"Fail: Login_with_valid_username_password");
		else if (role.equals("END_USER"))
			Assert.assertEquals(currenturl, "https://ecollabdds.ehospital.nic.in/management/enduserdashboard",
					"Fail: Login_with_valid_username_password");
		Assert.assertTrue(userAndRole.getText().contains(role), "Role displayed on default page is incorrect. ");
		Assert.assertTrue(userAndRole.getText().contains(username),
				"Username displayed on default page is incorrect. ");

	}

	public void login_with_invalid_username(String password, SoftAssert Assert) throws Throwable {
		usernameTextbox.sendKeys("abcdefg1");
		passwordTextbox.sendKeys(password);
		Thread.sleep(10000);
		signInButton.click();
		Thread.sleep(2000);
		String login_note = loginWarning.getText();
		Assert.assertEquals(login_note, "Invalid username, password or security code",
				"Failed: Login_with_invalid_username");

	}

	public void login_with_invalid_password(String username, SoftAssert Assert) throws Throwable {
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys("abcdefg1");
		Thread.sleep(10000);
		signInButton.click();
		Thread.sleep(2000);
		String login_note = loginWarning.getText();
		Assert.assertEquals(login_note, "Invalid username, password or security code",
				"Failed: Login_with_invalid_password");
	}
}
