package _05_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault v = new Vault(913895);
		JamesBond jb = new JamesBond();
		int code = jb.findCode(v);
		System.out.println(code);
	}
}
