package collection.map;

import java.util.TreeMap;

public class JdkTreeMap
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(new Integer(1), new String("Ann")); // hashCode - 65985
		treeMap.put(new Integer(2), new String("John")); // hashCode - 2314539
		treeMap.put(new Integer(3), new String("Kate")); // hashCode - 2331239
		
		for(String name : treeMap.values())
		{
			System.out.println(name.hashCode());
		}
	}
}
