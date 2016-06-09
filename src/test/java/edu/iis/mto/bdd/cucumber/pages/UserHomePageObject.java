package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class UserHomePageObject extends PageObject{

	@FindBy(id = "welcome-message")
	public WebElement welcomeMessage;
	
	public String getWelcomeMessage(){
		return welcomeMessage.getText();
	}
	
}
