package com.elavon.ec_automation.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.elavon.ec_automation.steps.serenity.InternalUserSteps;

public class DefinitionSteps {

    @Steps
    InternalUserSteps internalUser;

    @Given("the Internal User is on ElavonConnect")
    public void givenTheInternalUserIsOnElavonConnect() {
    	internalUser.is_on_splash_page();
    }
    
    @Given("the Internal User signs in")
    public void givenTheInternalUserSignsIn() {
    	internalUser.signs_in();
    }

    @When("the Internal User searches for a customer with a User ID '(.*)'")
    public void whenTheInternalUserSearchesForACustomerUserIdOf(String userID) {
    	internalUser.searches_customer(userID);
    }

    @Then("the Internal User should see a Customer User ID '(.*)'")
    public void thenTheInternalUserShouldSeeACustomerUserIdOf(String userID) {
  
    }

}
