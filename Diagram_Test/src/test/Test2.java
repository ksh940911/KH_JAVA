package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 하한 입력 : ");
		int min = sc.nextInt();
		
		System.out.print("나이 상한 입력 : ");
		int max = sc.nextInt();
		
		int[] ageArr = new int[max - min + 1];
		int[] countArr = new int[max - min + 1];
		
		for(int i = 0; i < ageArr.length; i++) {
			ageArr[i] = min + i;       //min == 19 / 19 20 21 22 23 24 
		}
			
		System.out.print("학생 수 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			if(age > max || age < min) {
				System.out.println("범위를 벗어났습니다. 다시입력하세요");
				i--;
			}
			else {
				for(int j = 0; j < ageArr.length; j++) {
					if (ageArr[j] == age) {
						countArr[j]++;
					}
				}
			}
		}
		
		System.out.println("나이  학생수");
		for(int i = 0; i < ageArr.length; i++) {
			System.out.println(ageArr[i] + "  " + countArr[i]);
		}
	}
}
