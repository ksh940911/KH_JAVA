package kh.java.email.controller;

import java.util.List;

import kh.java.email.io.EmailIO;
import kh.java.email.model.vo.Email;

public class EmailController {
	
	private EmailIO emailIO = new EmailIO();

	public void insertEmail(Email email) {
		//not only just a file
		emailIO.insertEmail(email);
	}

	public List<Email> loadEmailist() {
		return emailIO.loadEmailList();
	}
	
}
