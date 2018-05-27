package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class SignUpPage extends ProjectMethods{

	public SignUpPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleRadioButton;
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleClickNext;
	


	public SignUpPage SelectForShoppers() {
		verifySelected(eleRadioButton);
		
		return this;
	}
	
	public AccountSignPage ClickNextButton() {
		click(eleClickNext);
		
		return new AccountSignPage();
	}
}