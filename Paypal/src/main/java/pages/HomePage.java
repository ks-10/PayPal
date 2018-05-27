
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="signup-button")
	private WebElement eleSignUp;
	

	public SignUpPage ClickSignup() {
		click(eleSignUp);
		return new SignUpPage() ;
	}
}














