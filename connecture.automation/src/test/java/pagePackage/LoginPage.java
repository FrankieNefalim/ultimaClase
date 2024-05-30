package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basePackage.Base;

public class LoginPage extends Base{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	By titleLoginPage = By.xpath("//*[@id=\"root\"]/div/div[1]");
	By userName = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	By errorMessage = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
	By productTitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	
	
	public void loginStandardUser() {
		if(isDisplayed(titleLoginPage)) {
			type("standard_user", userName);
			type("secret_sauce", password);
			click(loginBtn);
		}
	}
	
	public void loginWithOutPassword() {
		if(isDisplayed(titleLoginPage)) {
			type("standard_user", userName);
			click(loginBtn);
		}
	}
	
	
	
	
	
	
	public boolean loginSuccess() {
		return isDisplayed(productTitle);
	}
	
	public boolean loginFailed() {
		return isDisplayed(errorMessage);
	}
	
	
	
	
}
