package com.douzone.springcontainer.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Component
@Named("blueblood")
public class BlueBlood implements CompactDisc {
	private String title="Endless Rain";
	private String artist="X-japan";
	
	@Override
	public String toString() {
		return "BlueBlood [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public void play() {
		System.out.println("playing"+title+"by"+artist);
	}

}
