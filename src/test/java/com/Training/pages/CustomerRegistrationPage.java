package com.Training.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import tools.Constants;
import tools.TimeConstants;

public class CustomerRegistrationPage extends PageObject {
	@FindBy(id = "firstname")
	private WebElement firstnameInput;

	@FindBy(id = "lastname")
	private WebElement lastnameInput;

	@FindBy(id = "email_address")
	private WebElement emailaddressInput;

	@FindBy(id = "password")
	private WebElement passwordInput;

	@FindBy(id = "confirmation")
	private WebElement confirmationeInput;

	@FindBy(id = "invitation_email")
	private WebElement invitationEmailInput;

	@FindBy(id = "is_subscribed")
	private WebElement newsletterCheckbox;

	@FindBy(id = "flag_stylist_parties")
	private WebElement partiesCheckbox;

	@FindBy(id = "flag_stylist_member")
	private WebElement memberCheckbox;

	@FindBy(id = "accept-checkbox")
	private WebElement iAgreeCheckbox;

	// ---------------------------------------------------
	@FindBy(id = "street_1")
	private WebElement streetInput;

	@FindBy(id = "house_number")
	private WebElement streetNumberInput;

	@FindBy(id = "zip")
	private WebElement postCodeInput;

	@FindBy(id = "distribution_zip")
	private WebElement distributionZip;

	@FindBy(id = "city")
	private WebElement cityInput;

	@FindBy(id = "country")
	private WebElement countrySelect;

	@FindBy(id = "registration-distribution-country")
	private WebElement distributionCountry;

	@FindBy(id = "telephone")
	private WebElement telephoneInput;

	@FindBy(css = "div.buttons-set.form-buttons.to-the-left button")
	private WebElement submitButton;

	// ----------------------search SC

	@FindBy(id = "by_geoip")
	private WebElement searchStylistByGeoip;

	@FindBy(id = "by_sc_name")
	private WebElement searchStylistByName;

	@FindBy(id = "search_firstname")
	private WebElement searchFirstNameInput;

	@FindBy(id = "search_lastname")
	private WebElement searchLastNameInput;

	@FindBy(id = "search_postcode")
	private WebElement searchPostcode;

	@FindBy(id = "search_countryId")
	private WebElement searchCountry;

	@FindBy(id = "sc_name_result")
	private WebElement styleCoachNameResult;

	@FindBy(css = "ul#stylist-list li:nth-child(1) div button")
	private WebElement firstStylistButton;

	@FindBy(css = "button[name='search_by_geoip_submit']")
	private WebElement searchByGeoipSubmitButton;

	@FindBy(css = "button[name='search_by_name_submit']")
	private WebElement searchByNameSubmitButton;

	@FindBy(id = "advice-validate-length-zip")
	private WebElement zipValidationMessage;
	
	 @FindBy(css = ".page-title h1")
	 private WebElement successMessageContainer;

	public void inputFirstName(String firstName) {
		element(firstnameInput).waitUntilVisible();
		firstnameInput.sendKeys(firstName);
	}

	public void inputLastName(String lastName) {
		element(lastnameInput).waitUntilVisible();
		lastnameInput.sendKeys(lastName);
	}

	public void inputEmail(String emailAddress) {
		element(emailaddressInput).waitUntilVisible();
		emailaddressInput.sendKeys(emailAddress);
		// waitABit(TimeConstants.MEDIUM);
		//waitFor(ExpectedConditions.invisibilityOfElementWithText(".blockUI.blockMsg.blockElement", "Bitte warten"));
	}

	public void inputPassword(String passText) {
		element(passwordInput).waitUntilVisible();
		passwordInput.sendKeys(passText);

	}

	public void inputConfirmation(String passText) {
		element(confirmationeInput).waitUntilVisible();
		confirmationeInput.sendKeys(passText);
	}

	public void inputStylistEmail(String stylistEmail) {
		invitationEmailInput.sendKeys(stylistEmail);
	}

	public void selectCountryName(String countryName) {
		element(countrySelect).waitUntilVisible();
		element(countrySelect).selectByVisibleText(countryName);
	}

	public void selectCountryNameFromPersonalInfo(String countryName) {
		element(distributionCountry).waitUntilVisible();
		element(distributionCountry).selectByVisibleText(countryName);
	}

	public void inputPhoneNumber(String phoneNumber) {
		telephoneInput.clear();
		telephoneInput.sendKeys(phoneNumber);
	}

	public void inputHouseNumber(String houseNumber) {
		streetNumberInput.clear();
		streetNumberInput.sendKeys(houseNumber);
	}

	public void inputPlz(String plz) {
		postCodeInput.clear();
		postCodeInput.sendKeys(plz);
	}

	public void checkAgree() {
		iAgreeCheckbox.click();
	}

	public void inputCity(String city) {
		cityInput.clear();
		cityInput.sendKeys(city);
	}

	public void inputStreet(String street) {
		streetInput.clear();
		streetInput.sendKeys(street);
	}

	public void clickBecomeStylecoach() {
		waitABit(TimeConstants.MEDIUM);
		element(memberCheckbox).waitUntilVisible();
		memberCheckbox.click();
	}

	public void submitForm() {
		submitButton.click();
	}

	public void selectStylecoach() {
		firstStylistButton.click();
	}
	public void verifySuccessMessage(){
		Assert.assertTrue(successMessageContainer.getText().contains(Constants.REGISTRATION_SUCCESS_MESSAGE));
	}
}
