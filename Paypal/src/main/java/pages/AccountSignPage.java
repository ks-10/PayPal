package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AccountSignPage extends ProjectMethods{

	public AccountSignPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="country")
	private WebElement eleSelectCountry;
	
	@FindBy(how=How.ID,using="email")
	private WebElement eleTypeEmail;
	
	@FindBy(how=How.ID,using="password")
	private WebElement eleTypePassWord;
	
	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement eleTypeConformPassWord;
	
	@FindBy(how=How.ID,using="_eventId_continue")
	private WebElement eleClickContinue;
	
	


	public AccountSignPage SelectCountry(String data) {
		selectDropDownUsingText(eleSelectCountry, data);
		return this;
	}
	
	public AccountSignPage TypeEmail(String data) {
		type(eleTypeEmail, data);
		return this;
	}
	
	public AccountSignPage TypePassword(String data) {
		type(eleTypePassWord, data);
		return this;
	}
	
	public AccountSignPage TypeConformPassword(String data){
		type(eleTypeConformPassWord, data);
		return this;
	}
	
	public AccountSignPage clickContinue(){
		click(eleClickContinue);
		return this;
	}
	
	
	
	
	
	
}