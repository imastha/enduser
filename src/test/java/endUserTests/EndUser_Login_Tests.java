package endUserTests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eCollabDDSPages.Loginpage;
import endUserPages.EndUser_Login_Page;

public class EndUser_Login_Tests extends TestBase{
	@Test(priority = 0)
	public void EndUser_Login_Page_Test() throws Throwable {
		SoftAssert Assert=new SoftAssert();
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\euBrowser.properties");
		properties.load(inputstream);
		String username = properties.getProperty("eu_username");
		String password = properties.getProperty("eu_password");
		String role=properties.getProperty("eu_role");
		EndUser_Login_Page login= PageFactory.initElements(driver, EndUser_Login_Page.class);
		//login.login_with_invalid_username(password,Assert);
		//login.login_with_invalid_password(username,Assert);
		login.login_with_valid_username_password(username, password, role, Assert);
        Assert.assertAll();
	}
}


