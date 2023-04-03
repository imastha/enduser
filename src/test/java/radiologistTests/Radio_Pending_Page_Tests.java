package radiologistTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserTests.TestBase;
import radiologistPages.Radio_Pending_Page;

public class Radio_Pending_Page_Tests extends TestBase{

	@Test(priority = 1)
	public void radio_Pending_Default_Tests(){
		SoftAssert Assert= new SoftAssert();
		Radio_Pending_Page radiop=new Radio_Pending_Page(driver);
		radiop.open_Pending_Vcard(Assert);
		radiop.hideColumn_validation(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 2)
	public void radio_pendingCase_Test() throws IOException, InterruptedException{
		SoftAssert Assert=new SoftAssert();
		Radio_Pending_Page radiop=new Radio_Pending_Page(driver);
		radiop.search_Open_Pending_Case(Assert);
		Assert.assertAll();
	}
}
