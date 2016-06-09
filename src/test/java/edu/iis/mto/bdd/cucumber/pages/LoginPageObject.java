package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.WebElement;

public class LoginPageObject {
	private WebElement email;
	private WebElement password;
	
	private WebElement signin;
	
	public void login(String email, String password){
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.signin.click();
	}
}
