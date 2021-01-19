package Login.model.vo;

import java.io.Serializable;
import java.util.Objects;

public class Login implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String password;
	private String name;
	private String emailAddress;
	private String gender;
	private String introduce;
	public Login() {
		super();
	}
	
	public Login(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public Login(String id, String password, String name, String emilAddress, String gender, String introduce) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.emailAddress = emilAddress;
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
		if(this.id.equals(temp.id) && this.password.equals(temp.password)) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, password);
	}
	
}