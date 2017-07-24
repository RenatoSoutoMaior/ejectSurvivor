package com.rsm;

import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.JOptionPane;

public class Music {

	private static Sequencer player;
	private static String musicPath = "src/main/resources/music/IPutASpellOnYou.mid";
	private int repeat = 10;

	public void playMusic() {

		try {
			player = MidiSystem.getSequencer();
			Sequence music = MidiSystem.getSequence(new File(musicPath));
			player.open();
			player.setSequence(music);
			player.setLoopCount(repeat);
			player.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error playing the music: " + musicPath);
		}
	}
}