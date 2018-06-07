package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class Sampel {
	public void run() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Request Catalog").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Balaji");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Venkat");
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Zoho");
		driver.findElementByName("generalAddress1").sendKeys("ABCD");
		driver.findElementByName("generalAddress2").sendKeys("ABCD");
		driver.findElementByName("generalCity").sendKeys("ABCD");
		WebElement postalCode = driver.findElementById("generalStateProvinceGeoId");
		Select obj = new Select(postalCode);
		obj.selectByVisibleText("CA");
		driver.findElementById("generalPostalCode").sendKeys("600025");
		WebElement country = driver.findElementById("generalCountryGeoId");
		Select Obj1 = new Select(country);
		Obj1.selectByVisibleText("India");
		driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys("bala@gmail.com");
		WebElement interest = driver.findElementByName("answers_CATRQ_WHY_REQD");
		Select obj2 = new Select(interest);
		obj2.selectByIndex(1);
		WebElement car = driver.findElementByName("answers_CATRQ_CAR_TYPE");
		Select obj3 = new Select(car);
		obj3.selectByIndex(4);
		driver.findElementByClassName("textAreaBox").sendKeys("ABCD");
		driver.findElementByClassName("smallSubmit").click();
		 	
	}

}
