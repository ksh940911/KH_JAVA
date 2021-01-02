package kh.java.io.byte_.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		FileIOTest f = new FileIOTest();
		f.test1();
		
		f.test2();
		System.out.println("--- 정상종료 ---");
	}
	
	/**
	 * 내 컴퓨터의 이미지파일을 복사해서 byte폴더 하위에 위치시킬것.
	 * 경로상의 한글을 피할것.
	 * 
	 * 
	 */
	public void test2() {
		String fileName = "C:\\Users\\ksh94\\Desktop\\image.png";
		String destName = "image_copy.png";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream(destName);
			
			int data = 0;
			
			while((data = fis.read()) != -1) {
				fos.write(data);
			} 
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 복사 완료!");
		
		
	}	
	
	public void test1() {
		String filePath = "test.txt";
		String copyPath = "byte/test_copy.txt";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream(filePath);
			fos = new FileOutputStream(copyPath);
			
			int data = 0; //읽어온 데이터를 담을 변수
			
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
				fos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
