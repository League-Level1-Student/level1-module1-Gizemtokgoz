package _05_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault v = new Vault(91389);
		JamesBond jb = new JamesBond();
		int code = jb.findCode(v);
		System.out.println("James bond found the secret code, " + code);
	}
}
