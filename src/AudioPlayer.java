// Copyright Wintriss Technical Schools 2013
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/* 1. Download JLayer: http://www.javazoom.net/javalayer/javalayer.html, and add jar to project 
 * 4. Create a front end with buttons to allow user to mix 2 songs. (JFrame, JPanel, JButton */

public class AudioPlayer {

	public static void main(String[] args) throws IOException,
			JavaLayerException {
		/* 2. Find a sound online */

		/* 3. Play it with one of the public methods below */
		playSongFromAFile("/Users/shivamalhotra/Desktop/Can't Hold Us.mp3");

	}
	
	public static void playSongFromTheInternet(String songAddress)
			throws IOException, JavaLayerException {
		URL songUrl = new URL(songAddress);
		playSong(songUrl.openStream());
	}

	public static void playSongFromAFile(String fileName)
			throws FileNotFoundException, JavaLayerException {
		InputStream songInputStream;
		try {
			songInputStream = new FileInputStream(fileName);
			System.out.println("Loaded song from " + new File(fileName));
		} catch (Exception e) {
			songInputStream = new AudioPlayer().getClass().getResourceAsStream(fileName);
			System.out.println("Loaded song from " + new AudioPlayer().getClass().getResource(fileName));
		}
		playSong(songInputStream);
	}
	

	private static void playSong(InputStream songStream)
			throws JavaLayerException {

		final Player playMp3 = new Player(songStream);

		Thread t = new Thread() {
			public void run() {
				try {
					playMp3.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch blocktt
					e.printStackTrace();
				}
			}
		};
		t.start();
	}

}
