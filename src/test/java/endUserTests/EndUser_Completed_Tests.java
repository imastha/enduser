package endUserTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserPages.EndUser_Completed_Page;

public class EndUser_Completed_Tests extends TestBase{

	@Test(priority = 1)
	public void open_Completed_vcards() throws IOException, InterruptedException{
		SoftAssert Assert = new SoftAssert();
		EndUser_Completed_Page ecpage = new EndUser_Completed_Page(driver);
		ecpage.open_Completed_vcard(Assert);
		ecpage.hideColumn_Validation(Assert);
		Assert.assertAll();
	}

	@Test(priority = 2)
	public void completed_case_Validation() throws IOException, InterruptedException{
		SoftAssert Assert= new SoftAssert();
		EndUser_Completed_Page ecpage=new EndUser_Completed_Page(driver);
		ecpage.completed_case_Validation(Assert);
		Assert.assertAll();
	}

	@Test(priority = 3)
	public void hideColumn_Validation() throws IOException, InterruptedException{
		SoftAssert Assert= new SoftAssert();
		EndUser_Completed_Page ecpage=new EndUser_Completed_Page(driver);
		ecpage.hideColumn_Validation(Assert);
		Assert.assertAll();
	}

	@Test(priority = 4)
	public void Completed_Viewbtnn() throws IOException, InterruptedException{
		SoftAssert Assert= new SoftAssert();
		EndUser_Completed_Page ecpage=new EndUser_Completed_Page(driver);
		ecpage.Completed_Viewbtn(Assert);
		Assert.assertAll();
	}
}
