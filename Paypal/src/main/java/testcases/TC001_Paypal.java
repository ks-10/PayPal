package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;

public class TC001_Paypal extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_Paypal";
		testDescription="login  in Paypal Application";
		testNodes="Leads";
		category="Smoke";
		authors="kp";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String country , String email,String pwd,String cpwd) {
		
		new HomePage()
		.ClickSignup()
		.SelectForShoppers()
		.ClickNextButton()
		.SelectCountry(country)
		.TypeEmail(email)
		.TypePassword(pwd)
		.TypeConformPassword(cpwd)
		.clickContinue();
	}
}
