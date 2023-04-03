package endUserTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserPages.EndUser_Completed_Page;
import radiologistPages.Radio_Completed_Page;

public class EndUser_Completed_Tests extends TestBase{

	@Test(priority = 1)
	public void endUser_Completed_Default_Tests() throws IOException{
		SoftAssert Assert = new SoftAssert();
		EndUser_Completed_Page ecpage = new EndUser_Completed_Page(driver);
		ecpage.open_Completed_vcard(Assert);
		ecpage.hideColumn_Validation(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 2)
	public void enduser_Completed_Case_Tests() throws IOException{
		SoftAssert Assert= new SoftAssert();
		EndUser_Completed_Page ecpage=new EndUser_Completed_Page(driver);
		ecpage.completed_case_Validation(Assert);
		Assert.assertAll();
	}

}
