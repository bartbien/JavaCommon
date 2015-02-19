package performance.jdk.collection.maps;

import java.util.HashMap;
import java.util.Hashtable;

import org.junit.Test;

import performance.jdk.collection.runner.SizeUtils;

public class HashTableTest
{
	@Test
	public void addArrayList()
	{
		
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		for (int i = 0; i < SizeUtils.size; i++)
		{
			hashtable.put("test" + i, Integer.valueOf(i));
		}
	}
}
