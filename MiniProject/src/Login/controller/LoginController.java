package Login.controller;

import Login.io.LoginIO;
import Login.model.vo.Login;

public class LoginController {
	
	private LoginIO loginIo= new LoginIO();

	public static void insertId(Login iD) {
		LoginIO.insertId(iD);
	}
	
	
}
