package com.oop.book.controller;

import java.util.Scanner;

import com.oop.book.model.Book;

public class BookManager {

	private Book[] bar = null;
	private Scanner sc = new Scanner(System.in);
	private static int count = 0;
	int choice;
	{
	bar = new Book[10];
	}

	public void menu() {
		do {
			System.out.println("<메뉴 화면>");
			System.out.println("***** 도서 관리 메뉴 *****");
			System.out.println();
			System.out.println("1.도서 정보 추가");
			System.out.println("2.모두 출력");
			System.out.println("7.끝내기");
			choice = sc.nextInt();
			if(choice==1) {
				bookInput();
			}
			if(choice==2) {
				bookAllOutput();
			}
			if(choice==7) {
				return;
			}
		}while(true);
	}

	public void bookInput() {
			System.out.println("책 정보를 입력하세요(제목, 가격, 할인율, 저자명) : ");
			bar[count] = new Book(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
			count++;
	}
	
	public void bookAllOutput() {
		for(int i=0;i<count;i++) {
			bar[i].information();
		}
	}
}
