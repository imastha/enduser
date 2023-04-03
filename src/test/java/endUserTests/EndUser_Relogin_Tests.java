package endUserTests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eCollabDDSPages.Loginpage;

public class EndUser_Relogin_Tests extends TestBase{
	@Test(priority = 0)
	public void login_EndUser_Test() throws Throwable {
		SoftAssert Assert=new SoftAssert();
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\euBrowser.properties");
		properties.load(inputstream);
		String username = properties.getProperty("eu_username");
		String password = properties.getProperty("eu_password");
		String role=properties.getProperty("eu_role");
		Loginpage login= PageFactory.initElements(driver, Loginpage.class);
		//login.login_with_invalid_username(password,Assert);
		//login.login_with_invalid_password(username,Assert);
		login.login_with_valid_username_password(username, password, role, Assert);
        Assert.assertAll();
	}
}

