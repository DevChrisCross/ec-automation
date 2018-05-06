package com.elavon.ec_automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignInPage extends PageObject{
	
	@FindBy(id="loginUsername")
	WebElementFacade usernameField;
	
	@FindBy(id="loginPassword")
	WebElementFacade passwordField;
	
	@FindBy(id="loginSignIn")
	WebElementFacade signInButton;
	
	public void enters_username() {
		usernameField.sendKeys("c038975");
	}
	
	public void enters_password() {
		passwordField.sendKeys("Architech@29");
	}
	
	public void signs_in() {
		this.enters_username();
		this.enters_password();
		this.signInButton.click();
	}
}


