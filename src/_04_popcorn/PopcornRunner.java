package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	//Popcorn pop = new Popcorn();
	Microwave wave = new Microwave();
	String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	wave.putInMicrowave(new Popcorn(flavor));
	String time = JOptionPane.showInputDialog("How long should we cook it?");
	int timeInt = Integer.parseInt(time);
	wave.setTime(timeInt);
	wave.startMicrowave();
}
}
