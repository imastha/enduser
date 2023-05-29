package endUserTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import endUserPages.EndUser_Rejected_Pages;

public class EndUser_Rejected_Tests extends TestBase{

	@Test(priority = 0)
	public void open_rejected_vcard() throws IOException, InterruptedException{
		SoftAssert Assert = new SoftAssert();
		EndUser_Rejected_Pages erpage  = new EndUser_Rejected_Pages(driver);
		erpage.open_rejected_vcard(Assert);
		Assert.assertAll();
	}


	@Test(priority = 1)
	public void rejected_allbtn() throws IOException, InterruptedException{
		SoftAssert Assert = new SoftAssert();
		EndUser_Rejected_Pages erpage = new EndUser_Rejected_Pages(driver);
		 erpage.rejected_allbtn();
		Assert.assertAll();
	}
	

	@Test(priority = 2)
	public void Rejected_Viewbtn() throws IOException, InterruptedException{
		SoftAssert Assert = new SoftAssert();
		EndUser_Rejected_Pages erpage = new EndUser_Rejected_Pages(driver);
		 erpage.Rejected_Viewbtn();
		Assert.assertAll();
	}

	}

