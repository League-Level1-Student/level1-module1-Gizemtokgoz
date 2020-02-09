package _07_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	public static void main(String[] args) {
		/*
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		JTextField answer = new JTextField(20);
		panel.add(answer);
		frame.pack();
		JButton button = new JButton();
		button.addMouseListener(null);
		*/
		
		String myinput = JOptionPane.showInputDialog("Enter a binary number with 8 digits (ex.01000001)");
		String myoutput = convert(myinput);
		System.out.println(myoutput);
		
	}

	static String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";// must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}
}
