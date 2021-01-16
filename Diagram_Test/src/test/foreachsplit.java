package test;

public class foreachsplit {
	public static void main(String[] args) {
		
	
		String data = "p001 핸드폰 노트8 120만원*p002 핸드폰 v10 98만원*c001 컴퓨터 엘지xnote 100만원*e001 가전 전자레인 30만원*e002 가전 세탁기 80만원";
		String[] arr = data.split("[*]");
		for (String s : arr) {
			System.out.println(s);
		}
	}
}
