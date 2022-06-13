package facadepattern;

import java.util.Scanner;

public class TailoringShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receptionist owner = new Receptionist();
		Scanner in = new Scanner(System.in);
		String dress = in.next();
		owner.takeOrder(dress);
	}

}
//https://betterprogramming.pub/design-patterns-factory-vs-strategy-f45db68f0088