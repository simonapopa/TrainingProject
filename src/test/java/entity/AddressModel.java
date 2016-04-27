package entity;

public class AddressModel {
	 private String streetAddress;
	 private String streetNumber;
	 private String homeTown;
	 private String postCode;
	 private String countryName;
	 private String phoneNumber;

	 public AddressModel() {
	  setStreetAddress("Finlandstrabe");
	  setStreetNumber("12");
	  setHomeTown("Steglitz");
	  setPostCode("12345");
	  setCountryName("Deutschland");
	  setPhoneNumber("00555123456");
	 }

	 public String getStreetAddress() {
	  return streetAddress;
	 }

	 public String getStreetNumber() {
	  return streetNumber;
	 }

	 public String getHomeTown() {
	  return homeTown;
	 }

	 public String getCountryName() {
	  return countryName;
	 }

	 public String getPhoneNumber() {
	  return phoneNumber;
	 }

	 public void setStreetAddress(String streetAddress) {
	  this.streetAddress = streetAddress;
	 }

	 public void setHomeTown(String homeTown) {
	  this.homeTown = homeTown;
	 }

	 public void setCountryName(String countryName) {
	  this.countryName = countryName;
	 }

	 public void setPhoneNumber(String phoneNumber) {
	  this.phoneNumber = phoneNumber;
	 }

	 public void setStreetNumber(String streetNumber) {
	  this.streetNumber = streetNumber;
	 }

	 public String getPostCode() {
	  return postCode;
	 }

	 public void setPostCode(String postCode) {
	  this.postCode = postCode;
	 }
}
