package kh.java.email.model.vo;

import java.io.Serializable;

public class Email implements Serializable {
	
	private String email;

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Email(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}
}