package com.Training.steps.serenity;

import org.junit.Test;

import com.Training.pages.CustomerRegistrationPage;

import entity.AddressModel;
import entity.CustomerModel;
import net.thucydides.core.steps.ScenarioSteps;
import tools.Constants;
import tools.TimeConstants;

public class CustomerRegistrationSteps extends ScenarioSteps {

	private static final long serialVersionUID = -1000773529243859323L;

	CustomerRegistrationPage customerRegistrationPage;

	@Step
	public void fillPersonalDetails(CustomerModel model) {
		customerRegistrationPage.inputFirstName(model.getFirstname());
		customerRegistrationPage.inputLastName(model.getLastname());
		customerRegistrationPage.inputEmail(model.getEmail());
	}

	@Step
	public void checkBecomeStylist() {
		customerRegistrationPage.clickBecomeStylecoach();
	}

	@Step
	public void fillAddressDetails(AddressModel model) {
		customerRegistrationPage.inputStreet(model.getStreetAddress());
		customerRegistrationPage.inputHouseNumber(model.getStreetNumber());
		customerRegistrationPage.inputCity(model.getHomeTown());
		customerRegistrationPage.inputPlz(model.getPostCode());
		customerRegistrationPage.selectCountryName(model.getCountryName());
		customerRegistrationPage.inputPhoneNumber(model.getPhoneNumber());

	}

	@Step
	public void navigateToUrl(String url) {
		getDriver().get(url);
	}

	@Step
	public void selectBecomeStylist() {
		customerRegistrationPage.selectStylecoach();
	}

	@Step
	public void acceptTerms() {
		customerRegistrationPage.checkAgree();
	}

	@Step
	public void submitForm() {
		customerRegistrationPage.submitForm();
	}
	

	@Step
	public void verifySuccessMessage() {
		customerRegistrationPage.verifySuccessMessage();
	}

}
