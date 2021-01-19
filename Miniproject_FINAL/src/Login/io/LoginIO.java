package Login.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

import Login.model.vo.Login;

public class LoginIO {

	// 회원 가입된 리스트 파일로 쓰기 작업하는 코드
	public void insertId(Login id) {
		Set<Login> set = loadId();
		File f = new File("userList.txt");
		
		// File에 쓰기작업
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));) {
			for (Login e : set) {
				oos.writeObject(e);
			}
			oos.writeObject(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 편집파일 재작성 후 읽기 (파일을 읽어오기만)
	public Set<Login> loadId() {
		Set<Login> set = new HashSet<Login>();
		File f = new File("userList.txt");
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));) {
			while (true) {
				Login log = (Login) ois.readObject();
				set.add(log);
			}
		} catch (FileNotFoundException e) {
			try {
				f.createNewFile(); // 최초 등록시 파일이 없으면 오류가 발생할수있음, 파일 생성동시에 실행.
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (EOFException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}

	// 매니저 아이디 읽기 (파일 읽어오기만)
	public Set<Login> loadManager() {
		Set<Login> set = new HashSet<Login>();
		File f = new File("ManagerList.txt");
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));) {
			while (true) {
				Login eng = (Login) ois.readObject();
				set.add(eng);
			}
		} catch (FileNotFoundException e) {
			try {
				f.createNewFile(); // 최초 등록시 파일이 없으면 오류가 발생할수있음, 파일 생성동시에 실행.
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (EOFException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}
//	 매니져 리스트 생성하기 위해 작성했던 코드
	public void ManagerUserModify(Set<Login> set) {
		
	File f = new File("ManagerList.txt");
		// File에 쓰기작업
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));) {
			for (Login e : set) {
				oos.writeObject(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
