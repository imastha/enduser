package endUserTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserPages.EndUser_Pending_Page;

public class EndUser_Pending_Tests extends TestBase {
	
	@Test
		(priority = 0)
	public void open_Pending_vcard() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Pending_Page euPending = new EndUser_Pending_Page(driver);
		euPending.open_Pending_vcard(Assert);
		Assert.assertAll();
	}
	@Test(priority = 1)
	public void Pending_allbtn() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Pending_Page euPending = new EndUser_Pending_Page(driver);
		euPending.Pending_allbtn(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 2)
	public void Pending_Viewbtn() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Pending_Page euPending = new EndUser_Pending_Page(driver);
		euPending.Pending_Viewbtn(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 3)
	public void Pending_Detailsbtn() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Pending_Page euPending = new EndUser_Pending_Page(driver);
		euPending.Pending_Detailsbtn(Assert);
		Assert.assertAll();
	}
	@Test(priority = 4)
	public void Pending_Actionbtn() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Pending_Page euPending = new EndUser_Pending_Page(driver);
		euPending.Pending_Actionbtn(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 5)
	public void Pending_Todaybtn() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Pending_Page euPending = new EndUser_Pending_Page(driver);
		euPending.Pending_Todaybtn(Assert);
		Assert.assertAll();
	}
	@Test(priority = 6)
	public void Pending_Yesterdaybtn() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Pending_Page euPending = new EndUser_Pending_Page(driver);
		euPending.Pending_Yesterdaybtn(Assert);
		Assert.assertAll();
	}
	
}



