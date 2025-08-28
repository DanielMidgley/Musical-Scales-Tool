package main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

public class Audio {

    public static void playNote(String noteName, int octave) {
        try {
            playSound(noteName.replace("#","S").replace("/", "") + octave + ".wav");
        } catch (Exception e) {
            System.err.println("Error playing sound: " + e.getMessage());
        }
    }

    private static synchronized void playSound(String url) {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    Audio.class.getResourceAsStream("/main/resources/audio/" + url));
            clip.open(inputStream);

            // Add a listener to know when playback is done
            final boolean[] playbackComplete = {false};
            clip.addLineListener(new LineListener() {
                public void update(LineEvent event) {
                    if (event.getType() == LineEvent.Type.STOP) {
                        playbackComplete[0] = true;
                    }
                }
            });

            clip.start();

            // Wait for playback to complete
            while (!playbackComplete[0]) {
                Thread.sleep(100);
            }

            clip.close();
        } catch (Exception e) {
            System.err.println("Error playing sound: " + e.getMessage());
        }
    }

}
