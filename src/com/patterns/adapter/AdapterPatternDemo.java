package com.patterns.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("mp3", "1111.mp3");
		audioPlayer.play("mp4", "2222.mp4");
		audioPlayer.play("vlc", "3333.vlc");
		audioPlayer.play("avi", "4444.avi");

	}

}
