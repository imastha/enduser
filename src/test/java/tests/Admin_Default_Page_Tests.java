package tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eCollabDDSPages.Admin_Default_Page;

public class Admin_Default_Page_Tests extends TestBase{
	
	@Test(priority=1)
	public void Admin_myProfile_button_Test() {
		SoftAssert Assert=new SoftAssert();
		Admin_Default_Page adminDefault= new Admin_Default_Page(driver);
		adminDefault.Admin_myProfile_button(Assert);
		Assert.assertAll();
	}
	@Test(priority=2)
	public void Admin_Home_Button_Test() {
		SoftAssert Assert=new SoftAssert();
		Admin_Default_Page adminDefault= new Admin_Default_Page(driver);
		adminDefault.Admin_Home_Button(Assert);
		Assert.assertAll();
	}
	@Test(priority=3)
	public void Admin_Default_Page_vCards_Test() throws IOException {
		SoftAssert Assert=new SoftAssert();
		Admin_Default_Page adminDefault= new Admin_Default_Page(driver);
		adminDefault.Admin_Default_Page_vCards(Assert);
		adminDefault.Admin_Dafault_Page_vCardsCounts(Assert);
		Assert.assertAll();
	}
	@Test(priority=4)
	public void Admin_Logout_Button_Test() {
		SoftAssert Assert=new SoftAssert();
		Admin_Default_Page adminDefault= new Admin_Default_Page(driver);
		adminDefault.Admin_Logout_Button(Assert);
		Assert.assertAll();
	}
}

