package radiologistTests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eCollabDDSPages.Loginpage;
import endUserTests.TestBase;

public class Radio_Login_Tests extends TestBase{
	@Test(priority = 0)
	public void login_Radio_Test() throws Throwable {
		SoftAssert Assert=new SoftAssert();
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\radioBrowser.properties");
		properties.load(inputstream);
		String username = properties.getProperty("r_username");
		String password = properties.getProperty("r_password");
		String role=properties.getProperty("r_role");
		Loginpage login= PageFactory.initElements(driver, Loginpage.class);
		//login.login_with_invalid_username(password,Assert);
		//login.login_with_invalid_password(username,Assert);
		login.login_with_valid_username_password(username, password, role, Assert);
        Assert.assertAll();
	}
}
