package com.collection.list.music.model.compare;

import java.util.Comparator;

import com.collection.list.music.model.vo.Music;

public class SingerDesc implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		return o2.getSinger().compareTo(o1.getSinger());
	}
	
}
