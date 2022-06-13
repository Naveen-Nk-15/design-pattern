package factorypattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NKfactory mySecretFactory = new NKfactory();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the os you needed");
		String order = in.next();
		try
		{
			OS selectedOs = mySecretFactory.getMyOS(order);
			selectedOs.spec();
		}
		catch (Exception e)
		{
			System.out.println("error"+e);
		}
	}

}
