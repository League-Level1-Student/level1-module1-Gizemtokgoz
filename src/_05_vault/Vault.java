package _05_vault;

public class Vault {
	int code = 1234;

	boolean tryCode(int code) {
		if (code == this.code) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Vault v = new Vault();
		System.out.println(v.tryCode());
	}
}
