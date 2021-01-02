package kh.java.io.byte_.object;

import java.io.Serializable;
import java.util.Calendar;

/**
 * 
 * 직렬화 할수 있는 Serializable
 * 
 * 객체입출력스트림에서 사용되어질 객체는 반드시 Serializable을 구현해야한다.
 * 그렇지 않으면, NotSerializableException을 발생시킨다.
 *
 */
public class User implements Serializable {
	
	/**
	 * 클래스별 고유번호
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	//객체입출력스트림에서 해당값을 전송하지 않는다.
	private transient String password;
	private String name;
	private Calendar regDate;
	
	public User() {
		super();
	}

	public User(String id, String password, String name, Calendar regDate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.regDate = regDate;
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

	public Calendar getRegDate() {
		return regDate;
	}

	public void setRegDate(Calendar regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", regDate=" + regDate + "]";
	}
	
	
}
