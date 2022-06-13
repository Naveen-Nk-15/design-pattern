package factorypattern;

import java.lang.reflect.InvocationTargetException;

public class NKfactory {

	public OS getMyOS(String requiredOs) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		Class myOs = Class.forName("factorypattern."+requiredOs);
		return (OS) myOs.getDeclaredConstructor().newInstance();
	}
}
