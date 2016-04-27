package entity;

import tools.FieldGenerator;
import tools.FieldGenerator.Mode;

public class CustomerModel {
	private String firstname;
	private String lastname;
	private String password;
	private String email;

	public CustomerModel() throws Exception {
		  setFirstName();
		  setLastName();
		  setEmailName();
		  setPassword();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName() throws Exception {
		this.firstname = FieldGenerator.generateRandomString(8, Mode.ALPHA);
	}

	public void setLastName() throws Exception {
		this.lastname = FieldGenerator.generateRandomString(8, Mode.ALPHA);
	}

	public void setEmailName() throws Exception {
		this.email = FieldGenerator.generateRandomString(12, Mode.ALPHANUMERIC) + "@" + "mailinator.com";
	}

	public void setPassword() throws Exception {
		this.password = FieldGenerator.generateRandomString(13, Mode.ALPHANUMERIC) + "q1";
	}

	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
}
