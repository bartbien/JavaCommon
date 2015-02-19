package collection.map;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;
import java.util.HashMap;

public class JdkHashMap
{

	public static void main(String[] args)
	{
		// Hashtable<K, V>;

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put(new String("Kate"), new Integer(1));
		map.put(new String("John"), new Integer(2));
		map.put(new String("Kate"), new Integer(3)); // override Kate cuz keys are stored as set

		for (String key : map.keySet())
		{
			System.out.println(key);
		}

		for (Integer values : map.values())
		{
			System.out.println(values);
		}

		System.out.println("hahs code Kate -> " + map.get("Kate").hashCode());
		System.out.println("hahs code John -> " + map.get("John").hashCode());
		System.out.println("hahs code Kate -> " + map.get("Kate").hashCode());

		for (String keySet : map.keySet())
		{
			System.out.println(keySet.hashCode());
		}

		for (Integer values : map.values())
		{
			System.out.println(values.hashCode());
		}

		// for(Method method : map.getClass().getMethods())
		// {
		// System.out.println(method);
		// System.out.println(method.getName());
		// }

	}

}
