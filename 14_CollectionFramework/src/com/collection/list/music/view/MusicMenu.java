package com.collection.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.collection.list.music.controller.MusicManager;
import com.collection.list.music.model.compare.SingerDesc;
import com.collection.list.music.model.compare.TitleAsc;
import com.collection.list.music.model.compare.TitleDesc;
import com.collection.list.music.model.vo.Music;

public class MusicMenu {
	private MusicManager manager = new MusicManager();
	private Scanner sc = new Scanner(System.in);
			
	public void mainMenu() {
		String menu = "----- Music Playlist Menu -----\r\n" + 
					"1.목록보기\r\n" + 
					"2.마지막에 음악추가\r\n" + 
					"3.매처음에 음악추가\r\n" + 
					"4.곡삭제\r\n" + 
					"5.곡변경\r\n" + 
					"6.곡명검색\r\n" + 
					"7.가수검색\r\n" + 
					"8.목록정렬(곡명오름차순)\r\n" + 
					"0.종료\r\n" + 
					"--------------------------------\r\n" + 
					">> 메뉴선택 : ";
		
		while(true) {
			System.out.print(menu);
			int selected = sc.nextInt();
			
			boolean result = false;
			//사용자입력에 따른 분기
			switch(selected) {
			case 1: printList(manager.selectList());break;
			case 2: manager.addList(inputMusic());break;
			case 3: manager.addAtZero(inputMusic());break;
			case 4: 
				result = manager.removeMusic(inputTitle());
				System.out.println(result ? "> 삭제 성공!" : "> 삭제 실패! 찾으시는 곡이 없습니다.");
				break;
			case 5: 
				result = manager.replaceMusic(inputMusic(), inputMusic());
				System.out.println(result ? "> 수정 성공!" : "> 수정 실패! 찾으시는 곡이 없습니다.");
				break;
			case 6: 
				printList(manager.searchMusicByTitle(inputTitle()));
				break;
			case 7: 
				printList(manager.searchMusicBySinger(inputSinger()));
				break;
			case 8: orderMenu(); break; 
			case 0: return; 
			default : System.out.println("잘못 입력하셨습니다.");
			}
				
		}
		
		
	}

	private void orderMenu() {
		String orderMenu = "================== 정렬 메뉴 ===================\r\n" + 
										"1. 가수명 오름차순\r\n" + 
										"2. 가수명 내림차순\r\n" + 
										"3. 곡명 오름차순\r\n" + 
										"4. 곡명 내림차순\r\n" + 
										"5. 메인메뉴 돌아가기\r\n" + 
										"================================================\r\n" + 
										" >> 메뉴 선택 : ";
				
		while(true) {
			System.out.print(orderMenu);
			int selected = sc.nextInt();
			switch(selected) {
			case 1: printList(manager.orderBy(null)); break;
			case 2: printList(manager.orderBy(new SingerDesc())); break;
			case 3: printList(manager.orderBy(new TitleAsc())); break;
			case 4: printList(manager.orderBy(new TitleDesc())); break;
			case 5: return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	private void printList(List<Music> list) {
		System.out.println("==========================================");
		if(!list.isEmpty()) {
			System.out.println("곡명\t\t가수");
			System.out.println("------------------------------------");
			//1.for(index)
			//2.iterator
			//3.foreach
			for(Music m : list)
				System.out.println(m);
		}
		else {
			System.out.println("찾으시는 곡이 없습니다.");
		}
		System.out.println("------------------------------------\n");
	}
	
	public Music inputMusic() {
		System.out.print("곡명을 입력하세요 : ");
		String title = sc.next();
		System.out.print("가수명을 입력하세요 : ");
		String singer = sc.next();
		
		return new Music(title, singer);
	}
	
	public String inputTitle() {
		System.out.print("곡명을 입력하세요 : ");
		return sc.next();
	}
	
	public String inputSinger() {
		System.out.print("가수명을 입력하세요 : ");
		return sc.next();
	}
}
