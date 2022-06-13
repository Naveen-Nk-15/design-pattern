package strategypattern;

import java.util.Scanner;


public class nkFincorp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hii welcome to nkFincorp nambi vanga santhosama ponga");
		System.out.println("Enter your category on based on income \n0-for <1l \n1- for 1lakh to 5lakh\n 2-for 5 to 20l \n3-for politician");
		Scanner in =new Scanner(System.in);
		int category = in.nextInt();
		Interest strategy;
		if(category == 0)
		{
			strategy = new pavamInterest();
		}
		else if(category == 1)
		{
			strategy = new parvalaInterest();
		}
		else if(category == 2)
		{
			strategy = new poduvomInterest();
		}
		else
		{
			strategy = new rocketInterest();
		}
		strategy.calculate();
	}
}
