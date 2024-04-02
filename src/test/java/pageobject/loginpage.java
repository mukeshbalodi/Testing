package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
		
	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement Email;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	@CacheLookup
	WebElement button;
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	public void enterEmail(String mail) {
		Email.clear();
		Email.sendKeys(mail);
		
		
	}
	
	public void enterpassword(String pwd){
		password.clear();
		password.sendKeys(pwd);
		
	}
	
	public void clickonLoginButton() {
		button.click();
	}
	public void clickonLogoutButton() {
		logout.click();
	}
	
	
	
}
