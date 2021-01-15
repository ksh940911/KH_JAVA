package kh.java.email.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kh.java.email.model.vo.Email;

/**
 * 직접 파일에 접근하는 성격의 코드를 작성
 * ex) 파일에 접근해서 저장, 읽어오는 일 
 * 
 */
public class EmailIO {
	
	//필드로 만들기
	File f = new File("emailList.txt");
	
	/**
	 * emailList.txt 파일에 email객체 추가하기
	 */
	//흐름을 이해하도록 동일한 메서드명을 사용하기
	public void insertEmail(Email email) {
		//기존 정보 읽어오기
		List<Email> list = loadEmailList();
		list.add(email);
		System.out.println("list@iio.insertEmail = " + list);
		
		try(
			ObjectOutputStream oos = 
				new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
		){
			for(Email e : list)
			oos.writeObject(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//파일에 접근해서 읽어오기
	public List<Email> loadEmailList() {
		List<Email> list = new ArrayList<>();
		
		try(
			ObjectInputStream ois = 
				new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
		){
			while(true) {
				Email email = (Email)ois.readObject();
				list.add(email);
			}
		} catch (FileNotFoundException e) {
			//최초 등록시 FileNotFoundException발생 
		} catch (EOFException e) {
			//처리코드 없음.
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}