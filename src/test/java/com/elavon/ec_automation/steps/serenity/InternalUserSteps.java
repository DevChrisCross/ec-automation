package com.elavon.ec_automation.steps.serenity;

import com.elavon.ec_automation.pages.SignInPage;
import com.elavon.ec_automation.pages.SplashPage;

import cucumber.api.Pending;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class InternalUserSteps {

    SplashPage splashPage;
    SignInPage signInPage;

    @Step
    public void is_on_splash_page() {
    	splashPage.open();
    }
    
    @Step
    public void signs_in() {
    	splashPage.opens_sign_in_page();
    	signInPage.signs_in();
    }

    @Step
    public void searches_customer(String userID) {
    	
    }
}