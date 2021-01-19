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
	
	//매니져 리스트 작성하는 곳
	public void ManagerUserModify(Set<Login> set) {

		File f = new File("userList.txt");
		// File에 쓰기작업
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));) {
			for (Login e : set) {
				oos.writeObject(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// 읽기 (파일을 읽어오기만)
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
				// 최초 등록시 오류가 발생할수있음
				f.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (EOFException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}
	
	// 매니저 읽기 (파일을 읽어오기만)
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
					// 최초 등록시 오류가 발생할수있음
					f.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			} catch (EOFException e) {
			} catch (Exception e) {
				e.printStackTrace();
			}
			return set;
		}
}
