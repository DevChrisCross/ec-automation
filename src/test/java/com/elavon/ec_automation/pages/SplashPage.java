package com.elavon.ec_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

public class SplashPage extends PageObject {

    @FindBy(id="navbarSignIn")
    private WebElementFacade signInButton;

    public void opens_sign_in_page() {
    	signInButton.click();
    }
}