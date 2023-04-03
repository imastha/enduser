package radiologistTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserTests.TestBase;
import radiologistPages.Radio_Completed_Page;

public class Radio_Completed_Page_Tests extends TestBase {

	@Test(priority = 1)
	public void radio_Completed_Default_Tests(){
		SoftAssert Assert= new SoftAssert();
		Radio_Completed_Page radicp=new Radio_Completed_Page(driver);
		radicp.open_Completed_Vcard(Assert);
		radicp.hideColumn_validation(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 2)
	public void radio_Completed_Case_Tests() throws IOException{
		SoftAssert Assert= new SoftAssert();
		Radio_Completed_Page radicp=new Radio_Completed_Page(driver);
		radicp.completed_case_Validation(Assert);
		Assert.assertAll();
	}

}
