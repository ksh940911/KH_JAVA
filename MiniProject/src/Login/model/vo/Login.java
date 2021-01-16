package Login.model.vo;

import java.io.Serializable;
import java.util.Objects;

public class Login implements Serializable{
	
	//파일 객체를 만들때 고유번호값을 부여함.
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String password;
	private String name;
	private String emailAddress;
	private String gender;
	private String introduce;
	
	//로그인 비교용
	public Login(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	
	public Login() {
		super();
	}
	public Login(String id, String password, String name, String emailAddress, String gender, String introduce) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.emailAddress = emailAddress;
		this.gender = gender;
		this.introduce = introduce;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmilAddress() {
		return emailAddress;
	}
	public void setEmilAddress(String emilAddress) {
		this.emailAddress = emilAddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", emilAddress=" + emailAddress
				+ ", gender=" + gender + ", introduce=" + introduce + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Login))
			return false;
		Login temp = (Login)obj;
		if(this.id.equals(temp.id)&&this.password.equals(temp.password))//if(this.id.equals(temp.id))
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
}