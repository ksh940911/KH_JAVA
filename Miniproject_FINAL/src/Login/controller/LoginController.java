package Login.controller;

import java.util.Set;

import Login.io.LoginIO;
import Login.model.vo.Login;

public class LoginController {
	
	private LoginIO io= new LoginIO();

	//회원가입할때 io를 통해 쓰기작업하는 컨트롤러
	public void insertId(Login id) {
		io.insertId(id);
	}
	
	//회원가입된 회원으로 로그인할때 택스트파일에 회원 아이디 불러오는 컨트롤러
	public Set<Login> loadId() {
		return io.loadId();
	}
	
	//관리자 모드 로그인할때 택스트파일에 관리자 아이디 불러오는 컨트롤러
	public Set<Login> loadManagerId() {
		return io.loadManager();
	}
	
	//관리자 모드 테이블 모드에서 수정하는 값 입력해주는 컨트롤러
	public void ManagerUserModify(Set<Login> set) {
		 io.ManagerUserModify(set);
	}
}
