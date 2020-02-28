package _06_duck;

public class monkey {
	int numberOfBananas;
	String favoriteTree;
	
	void climb() {
		System.out.println("Monkey has started to climb.");
	}
	void eatBanana(){
		System.out.println("Monkey started to eat the banana.");
	}
	monkey(String favoriteTree, int numberOfBananas) {
	       this.favoriteTree = favoriteTree;
	       this.numberOfBananas = numberOfBananas;
	}
}
