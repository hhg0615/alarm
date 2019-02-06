 package alarm;
  
import java.io.File;

import javax.sound.sampled.AudioFormat;

import javax.sound.sampled.AudioInputStream;

import javax.sound.sampled.AudioSystem;

import javax.sound.sampled.Clip;

import javax.sound.sampled.DataLine;

import javax.swing.JFrame;


  public class PlaySound2 extends JFrame{

		Clip clip;  //.wav ���� ��������� clip



		//��Ŭ������ src ������ ������ ������ �ڵ����� bin������ ������ �����. �׷��Ƿ� getResource �� ������ �� ����

		String path = PlaySound2.class.getResource("").getPath();

		

		public PlaySound2() {

			setTitle("AudioTest");

			

			File bgm;

			AudioInputStream stream;

			AudioFormat format;

			DataLine.Info info;

			bgm = new File(path+"aram.wav");

			

			try {

				stream = AudioSystem.getAudioInputStream(bgm);

				format = stream.getFormat();

				info = new DataLine.Info(Clip.class, format);

				clip = (Clip) AudioSystem.getLine(info);

				clip.open(stream);

				clip.start();

			} catch (Exception e) {

			}

			

			setBounds(300, 300, 300, 300);

			setVisible(true);

		}

		public static void playsound() {

			new PlaySound2();

		}

}