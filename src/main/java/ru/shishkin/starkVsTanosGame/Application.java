package ru.shishkin.starkVsTanosGame;

//Библиотека
import javax.swing.JFrame;
/*
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.JavaSoundAudioDevice;
import javazoom.jl.player.advanced.AdvancedPlayer;
*/

public class Application {

	public static void main(String[] args) {
		/*
		String filepath = JOptionPane.showInputDialog("Введите путь до файла");
		Thread myPotok = new Thread (new Runnable() {
			public void run() {
				try {
					File soundFile = new File(filepath);
					InputStream potok = new FileInputStream(soundFile);
					AudioDevice auDev = new JavaSoundAudioDevice();
					AdvancedPlayer playmusic = new AdvancedPlayer(potok,auDev);
					while (true) {
						playmusic.play();
					}
				}
				catch (Exception err) {
					err.printStackTrace();
					JOptionPane.showMessageDialog(null, "Ошибка в расположении файла!");
				}
			}
		});
		myPotok.start();
		*/
		new ThreadWithMusic();

		JFrame okno = new JFrame("Stark Vs Tanos");
		okno.setBounds(10,10,1200,700);

		okno.setResizable(false);

		okno.add(new Panel());
		okno.setVisible(true);

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}