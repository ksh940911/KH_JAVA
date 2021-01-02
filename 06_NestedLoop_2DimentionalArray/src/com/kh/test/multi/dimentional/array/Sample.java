package com.kh.test.multi.dimentional.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.exercise1();
		
	}
	
	

	/**
	 * 
     * 1. 3행짜리5열 2차원배열 선언 및 생성
     * 2. 1~100사이의 임의의 정수를 모든 방에 기록함
     * 3. 각 행별 열의 합계가 5의 배수인 행열값만 출력함
	 * 
	 */
	private void exercise1() {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][5];
		
		//열의 합이 5의배수여부를 검사할 count변수 셋팅.
		int count = 0;
		
		//1. 값쓰기
		for (int i = 0; i < arr.length; i++) {
			int rowsum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*100)+1;
				rowsum += arr[i][j];
			}
			//2. 5의배수여부 검사&출력
			if(rowsum%5==0){
				count++;
				//출력
				for(int k = 0; k < arr[i].length; k++) {
					System.out.print(arr[i][k] + " ");
				}
				System.out.println(" -> 열의합계: "+rowsum);
			}
		}
		//5의배수인 열이 없을경우
		if(count==0) System.out.println("열의 합계가 5의 배수인 행이 없습니다");

		//생성된 난수배열 출력
		System.out.println("============================");
		System.out.println("arr[0]="+Arrays.toString(arr[0]));
		System.out.println("arr[1]="+Arrays.toString(arr[1]));
		System.out.println("arr[2]="+Arrays.toString(arr[2]));
		System.out.println("============================");
	}
	
	
	

}
