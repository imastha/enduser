package radiologistTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserTests.TestBase;
import radiologistPages.Radio_Pending_Page;

public class Radio_Pending_Page_Tests extends TestBase{

	@Test(priority = 0)
	public void  open_Pending_Vcard(){
		SoftAssert Assert= new SoftAssert();
		Radio_Pending_Page radiop=new Radio_Pending_Page(driver);
		radiop.open_Pending_Vcard(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 1)
	public void All_btn_validation() throws IOException, InterruptedException{
		SoftAssert Assert=new SoftAssert();
		Radio_Pending_Page radiop=new Radio_Pending_Page(driver);
		radiop.All_btn_validation(Assert);
		Assert.assertAll();
	}
}
