package facadepattern;

public class Receptionist {
	
	static int thread;
	static int oil;
	static int innermaterial;
	static void buyThread(String item)
	{
		if(item.equals("chudi"))
		{
			thread = 2;
		}
		else
		{
			thread = 1;
		}
	}
	static void buyOil(String item)
	{
		if(item.equals("chudi"))
		{
			oil = 200;
		}
		else
		{
			oil = 100;
		}
	}
	static void buyInnerMaterial(String item)
	{
		if(item.equals("chudi"))
		{
			innermaterial = 2;
		}
		else
		{
			innermaterial = 1;
		}
	}
	static void makeItem(String item)
	{
		tiruppurNkUnit stitchingUnit = new tiruppurNkUnit();
		try {
			stitchItem itemReady = stitchingUnit.getProduct(item,thread,oil,innermaterial);
			itemReady.stitch();
		}
		catch(Exception e)
		{
			System.out.println("sorry we are not currently providing the service");
		}
		
		
	}
	void takeOrder(String item)
	{
		Receptionist.buyThread(item);
		Receptionist.buyOil(item);
		Receptionist.buyInnerMaterial(item);
		Receptionist.makeItem(item);
	}
}
