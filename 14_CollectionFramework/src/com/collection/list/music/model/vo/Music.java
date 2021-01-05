package com.collection.list.music.model.vo;

import java.util.Objects;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	
	public Music() {}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return title + "\t\t" + singer;
	}

	@Override
	public int compareTo(Music o) {
		return this.singer.compareTo(o.singer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}

	/**
	 * 필드값이 같다면, 동등한 객체로 취급
	 */
	@Override
	public boolean equals(Object obj) {
		//주소값이 같다면, 동일한 객체
		if (this == obj)
			return true;
		
		//현재객체는 null이 아니고, obj는 null
		if (obj == null)
			return false;
		
		//instanceof와 동일. 같은 타입인지 비교
		if (getClass() != obj.getClass())
			return false;
		
		//형변환을 ClassCastException 없이 변환할 수 있다.
		Music other = (Music) obj;
		
		//참조형
		//1.null비교
		if (singer == null) {
			if (other.singer != null)
				return false;
		} 
		//2.null이 아닌 경우 비교
		else if (!singer.equals(other.singer))
			return false;
		
		if (title == null) {
			if (other.title != null)
				return false;
		} 
		else if (!title.equals(other.title))
			return false;
		
		return true;
	}
	
}
