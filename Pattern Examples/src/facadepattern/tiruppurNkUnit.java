package facadepattern;

import java.lang.reflect.InvocationTargetException;


public class tiruppurNkUnit {

	public stitchItem getProduct(String item,int thread,int oil,int innerMaterial) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		Class myItem = Class.forName("facadepattern."+item);
		System.out.println(thread+"cones of thread "+oil+" ml of oil"+innerMaterial+" metres of material is been consumed");
		return (stitchItem) myItem.getDeclaredConstructor().newInstance();	
	}
}
