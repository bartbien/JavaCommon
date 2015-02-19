package performance.jdk.collection.lists;

import java.util.LinkedList;

import org.junit.Test;

import performance.jdk.collection.runner.SizeUtils;

public class LinkedListTest
{

	@Test
	public void addLinkedList()
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		for (int i = 0; i < SizeUtils.size; i++)
		{
			linkedList.add("test" + i);
		}
	}
	
	
//	@Test
//	public void removeLinkedList()
//	{
//		LinkedList<String> linkedList = new LinkedList<String>();
//		for (int i = 0; i < SizeUtils.size; i++)
//		{
//			linkedList.add("test" + i);
//		}
//		
//		for (int i = SizeUtils.size - 1; i > 0 ; i-=2)
//		{
//			linkedList.remove(i);
//		}
//		
//	}
//	
//	@Test
//	public void getElementLinkedList()
//	{
//		LinkedList<String> linkedList = new LinkedList<String>();
//		for (int i = 0; i < SizeUtils.size; i++)
//		{
//			linkedList.add("test" + i);
//		}
//		
//		
//		for (int i = SizeUtils.size - 1; i > 0 ; i-=2)
//		{
//			linkedList.get(i);
//		}
//		
//	}
}
