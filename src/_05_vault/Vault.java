package _05_vault;

import javax.swing.JOptionPane;

public class Vault {
	int code;
	Vault(int c) {
		code = c;
	}

	boolean tryCode(int code) {
		if (code == this.code) {
			return true;
		}
		return false;
	}
}

