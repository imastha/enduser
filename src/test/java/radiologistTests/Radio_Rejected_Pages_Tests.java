package radiologistTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserTests.TestBase;
import radiologistPages.Radio_Default_Page;

public class Radio_Rejected_Pages_Tests extends TestBase{

	@Test(priority = 1)
	public void radio_myProfile_button_Test() {
		SoftAssert Assert = new SoftAssert();
		Radio_Default_Page rDefault = new Radio_Default_Page(driver);
		rDefault.radio_Home_button(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 2)
	public void radio_vCards_Test() {
		SoftAssert Assert = new SoftAssert();
		Radio_Default_Page rDefault = new Radio_Default_Page(driver);
		rDefault.radio_Default_vCards(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 3)
	public void radio_vCards_Counts_Test() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Radio_Default_Page rDefault = new Radio_Default_Page(driver);
		rDefault.radio_Default_vCards_Count(Assert);
		Assert.assertAll();
	}
	
	
	
}
