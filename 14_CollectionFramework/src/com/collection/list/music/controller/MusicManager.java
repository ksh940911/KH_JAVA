package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.model.vo.Music;

public class MusicManager {
	Scanner sc = new Scanner(System.in);
	private List<Music> mList = new ArrayList<>();
	{
		mList.add(new Music("한숨","이하이"));
		mList.add(new Music("너였다면","정승환"));
		mList.add(new Music("Bounce","조용필"));
		mList.add(new Music("열정","코요테"));
		mList.add(new Music("Hello","World"));
		mList.add(new Music("Party","sik-k"));
	}
	
	/**
	 * 1. 목록보기
	 * 필요에 따라 printList메소드를 오버라이딩해서 쓸 수 있다.
	 */
	public List<Music> selectList() {
		return mList;
	}
	
	


	/**
	 * 2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드.
	 */
	public void addList(Music m) {
		//생성된 Music객체를 리스트에 추가
		mList.add(m);
	}

	/**
	 * 3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
	 */
	public void addAtZero(Music m) {
		//0번지 music객체 추가
		mList.add(0,m);
	}

	/**
	 * 4. 특정곡을 삭제하는 메소드 : 제목으로 검색후 최초로 검색된 음악을 삭제
	 */
	public boolean removeMusic(String title) {
		//1.리스트를 열람후 곡을 찾음
		for(int i=0; i<mList.size(); i++) {
			//3.해당곡이 있을 경우 삭제
			if(title.equals(mList.get(i).getTitle())) {
				mList.remove(i);
//				mList.remove(mList.get(i));
				return true;
			}
		}
		
		//4.해당곡이 없을 경우에는 찾는 곡이 없는 경우
		return false;
			
	}

	/**
	 * 5. 특정곡을 바꾸는 메소드 
	 */
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		
		//1.리스트를 열람후 곡을 찾음
		for(int i=0; i<mList.size(); i++) {
			//3.해당곡이 있을 경우 새로운 music객체(사용자 입력)
			if(oldMusic.equals(mList.get(i))) {
				//대체
				mList.set(i, newMusic);
				return true;
			}
		}
		
		//4.해당곡이 없을 경우;
		return false;
	}

	/**
	 * 6. 특정곡이 있는지 검사하는 메소드
	 * (곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력) 
	 */
	public List<Music> searchMusicByTitle(String title) {

		//1.리스트 순회 : 곡이 있다면, 곡정보 출력
		//없다면, 곡이 없다고 피드백주기
		List<Music> searchList = new ArrayList<>();
		for(int i=0; i<mList.size(); i++) {
			//2.해당곡이 있을 경우 출력
			if(mList.get(i).getTitle().contains(title)) 
				searchList.add(mList.get(i));
		}
		
		return searchList;
	}


	/**
	 * 7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
	 */
	public List<Music> searchMusicBySinger(String singer) {
		//검색된 결과를 담을 리스트
		List<Music> searchList = new ArrayList<>();
		
		//1.리스트 순회 
		for(int i=0; i<mList.size(); i++) {
			//2.해당가수의 곡이 있을경우 출력
			if(mList.get(i).getSinger().contains(singer)) {	
				searchList.add(mList.get(i));				
			}
		}
		
		return searchList;
	}

	

	/**
	 * 8. 졍렬메소드
	 * @java.uril.Comparable을 구현한 Music 클래스 (comparedTo메소드 오버라이드)
	 * @java.util.Comparator를 구현한 클래스 작성(compare메소드오버라이드)
	 */
	public List<Music> orderBy(Comparator<Music> c) {
		//실제 원본 리스트를 변경하지 않으려면, clone후 진행한다.
		//ArrayList타입에 clone오버라이딩 되어있으므로, 형변환 필수.
		//실제 ArrayList에 대해 깊은 복사가 이루어 지지만, 참조하는 요소 Music객체는 동일하다.(복사생성자를 통해 다시 깊은 복사 가능)
		List<Music> mList = (List<Music>)((ArrayList)this.mList).clone();
		mList.sort(c);
		return mList;
	}

	
}





