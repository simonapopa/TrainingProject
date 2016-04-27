package com.Training.features.search;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Training.steps.serenity.CustomerRegistrationSteps;

import entity.AddressModel;
import entity.CustomerModel;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import tools.Constants;

@RunWith(SerenityRunner.class)
public class CustomerRegistrationTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public CustomerRegistrationSteps customerRegistrationSteps;

	CustomerModel customerModel;
	AddressModel addressModel;

	@Before
	public void setUp() throws Exception {
		customerModel = new CustomerModel();
		addressModel = new AddressModel();

	}

	@Test
	public void customerRegistrationTest() {
		customerRegistrationSteps.navigateToUrl(Constants.BASE_URL + Constants.CUSTOMER_REGISTRATION);
		customerRegistrationSteps.fillPersonalDetails(customerModel);
		customerRegistrationSteps.checkBecomeStylist();
		customerRegistrationSteps.fillAddressDetails(addressModel);
		customerRegistrationSteps.selectBecomeStylist();
		customerRegistrationSteps.acceptTerms();
		customerRegistrationSteps.submitForm();
		customerRegistrationSteps.verifySuccessMessage();
	}

}