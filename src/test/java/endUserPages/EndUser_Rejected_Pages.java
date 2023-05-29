package endUserPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class EndUser_Rejected_Pages {
	private WebDriver driver;

	public EndUser_Rejected_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@findby(xpath = "//div[@id='cardbgreject']")
	private WebElement rejectedgcard;

	@findby(xpath = "//label[@id='rejectcase']")
	private WebElement Allbtn;

	@findby(xpath = "(//i[@class='fa fa-eye'])[1]")
	private WebElement Viewbtn;

	@findby(xpath = "(//i)[5]")
	private WebElement reportbtn;

	@findby(xpath = "//label[@class='btn nicbgcolor completecase'][normalize-space()='Today']")
	private WebElement todaybtn;

	@findby(xpath = "//label[@class='btn nicbgcolor rejectcase'][normalize-space()='Yesterday']")
	private WebElement Yesterdaybtn;

	@findby(xpath = "//div[@class='toggffpicon']//i[@class='fa fa-arrow-left']")
	private WebElement viewback;

	@findby(xpath = "(//i[@class='fa fa-edit'])[1]")
	private WebElement detailbtn;

	public void open_rejected_vcard(SoftAssert assert1) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20, 1000);
		WebElement rejectedgcard = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='cardbgreject']")));
		Thread.sleep(5000);
		rejectedgcard.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,400)");
		Thread.sleep(2000);
	}

	public void rejected_allbtn() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(driver, 20, 1000);
		WebElement Allbtn = wait1
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='rejectcase']")));
		Thread.sleep(5000);
		Allbtn.click();
		System.out.println(1);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector(\"div[style='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300\r\n");

		System.out.println(2);
	}
	
	public void Rejected_Viewbtn() throws InterruptedException {
		WebElement Viewbtn = driver.findElement(By.xpath("(//i[@class='fa fa-eye'])[1]"));
		Thread.sleep(5000);
		Viewbtn.click();
		Thread.sleep(3000);
		System.out.println(3);
		
		
		Thread.sleep(5000);
		WebElement viewback = driver.findElement(By.xpath("//div[@class='toggffpicon']//i[@class='fa fa-arrow-left']"));
		Thread.sleep(2000);
		viewback.click();
		System.out.println(4);
		
		Thread.sleep(5000);
		WebElement rejectedgcard = driver.findElement(By.xpath("//div[@id='cardbgreject']"));
		Thread.sleep(2000);
		rejectedgcard.click();

		
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(100,400)");
		Thread.sleep(2000);
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript(
				"document.querySelector(\"div[style='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300\r\n");
		}
	
	public void Rejected_Detailsbtn(SoftAssert assert1) throws InterruptedException {
	
	
		Thread.sleep(3000);
		WebElement detailbtn = driver.findElement(By.xpath("//i[@class='fa fa-edit'])[1]"));
		detailbtn.click();
	
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,400)");
		
		//scrollup
		JavascriptExecutor js1111 = (JavascriptExecutor) driver;
		js1111.executeScript("window.scrollBy(400,100)");
		
		Thread.sleep(3000);
		WebElement rejectedgcard = driver.findElement(By.xpath("//div[@id='cardbgreject']"));
		rejectedgcard.click();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}