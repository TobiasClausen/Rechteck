package com.example.auto;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class SoundPlayer {

    public static void playSound(String filePath) {
        try {
            // Öffnen der Audiodatei
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            // Erstellen eines Clips und Laden der Audiodaten
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Abspielen des Sounds
            clip.start();

            // Optional: Warten, bis die Wiedergabe beendet ist
            clip.drain();


        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}