package endUserTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserPages.EndUser_Default_Page;

public class EndUser_Default_Page_Tests extends TestBase {
	
	@Test(priority = 1)
	public void EndUser_myProfile_button_Test() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Default_Page euDefault = new EndUser_Default_Page(driver);
		euDefault.EU_Home_button(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 2)
	public void EndUser_vCards_Test() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Default_Page euDefault = new EndUser_Default_Page(driver);
		euDefault.EU_Default_vCards(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 3)
	public void EndUser_vCards_Counts_Test() throws IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Default_Page euDefault = new EndUser_Default_Page(driver);
		euDefault.EU_Default_vCards_Count(Assert);
		Assert.assertAll();
	}
}
