package performance.jdk.collection.lists;

import java.util.Comparator;

import org.junit.Test;

import performance.jdk.collection.runner.SizeUtils;


public class ArrayListTest
{

	@Test
	public void addArrayList()
	{
		java.util.ArrayList<String> arrayList = new java.util.ArrayList<String>();
		for (int i = 0; i < SizeUtils.size; i++)
		{
			arrayList.add("test" + i);
		}
	}
	
//	@Test
//	public void removeArrayList()
//	{
//		java.util.ArrayList<String> arrayList = new java.util.ArrayList<String>();
//		
//		for (int i = 0; i < SizeUtils.size; i++)
//		{
//			arrayList.add("test" + i);
//		}
//		
//		for (int i = SizeUtils.size - 1; i > 0 ; i-=2)
//		{
//			arrayList.remove(i);
//		}
//		
//	}
//	
//	@Test
//	public void getElementArrayList()
//	{
//		java.util.ArrayList<String> arrayList = new java.util.ArrayList<String>();
//		
//		for (int i = 0; i < SizeUtils.size; i++)
//		{
//			arrayList.add("test" + i);
//		}
//		
//		for (int i = SizeUtils.size - 1; i > 0 ; i-=2)
//		{
//			arrayList.get(i);
//		}
//		
//	}
//	
//	@Test
//	public void sorttArrayList()
//	{
//		java.util.ArrayList<String> arrayList = new java.util.ArrayList<String>();
//		
//		for (int i = 0; i < SizeUtils.size; i++)
//		{
//			arrayList.add("test" + i);
//		}
//		
//		// arrayList.sort(c); with comparator
//		// sort
//		
//	}
}
