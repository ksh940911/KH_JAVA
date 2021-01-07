package test;

import java.util.Scanner;

class Complex {
	int age;
	int count = 0;
}


public class Test {
	public void main(String args[]) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int[] ageArr, countArr;

		System.out.print("나이 하한 입력 : "); // 19
		int min = sc.nextInt();

		System.out.print("나이 상한 입력 : ");
		int max = sc.nextInt();

		// 배열의 크기를 확인해서 할당
		ageArr = new int[max - min + 1];
		ageArr = new int[6];
		countArr = new int[max - min + 1];
		countArr = new int[6];

		// 나이배열 나이 채워주는거
		for (int i = 0; i < ageArr.length; i++)
			ageArr[i] = min + i;

		System.out.print("학생 수 : ");
		int num = sc.nextInt();

		// 학생 수만큼 반복
		for (int i = 0; i < num; i++) {
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			// 입력받은값이 나이 하한 보다 작거나 나이 상한보다 크다 = 우리가 원하는게 아님
			// 무효화
			if (age < min || age > max) {
				System.out.println("범위를 벗어났습니다. 다시입력하세요");
				i--;
			} else {
				for (int j = 0; j < ageArr.length; j++) {
					if (ageArr[j] == age)
						countArr[j] += 1;
				}
			}
		}

		// 출력 이니까 상관없고
		System.out.println("나이    학생수");
		for (int i = 0; i < ageArr.length; i++) {
			System.out.println(ageArr[i] + "   " + countArr[i]);
		}
	}
}
