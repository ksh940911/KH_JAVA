package Login.controller;

import java.util.Set;

import Login.io.LoginIO;
import Login.model.vo.Login;

public class LoginController {
	
	private LoginIO io= new LoginIO();

	public void insertId(Login id) {
		io.insertId(id);
	}
	public Set<Login> loadId() {
		return io.loadId();
	}
	
	public Set<Login> loadManagerId() {
		return io.loadManager();
	}
	
}
