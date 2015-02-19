package performance.jdk.collection.lists;

import java.util.Vector;

import org.junit.Test;

import performance.jdk.collection.runner.SizeUtils;
import utils.CommonUtils;

public class VectorTest
{

	@Test
	public void addToVector()
	{
		Vector<String> vector = new Vector<String>();
		for (int i = 0; i < SizeUtils.size; i++)
		{
			vector.add("test" + i);
		}
	}

//	@Test
//	public void removeFromVector()
//	{
//		java.util.Vector<String> vector = new Vector<String>();
//		for (int i = 0; i < SizeUtils.size; i++)
//		{
//			vector.add("test" + i);
//		}
//		
//		for (int i = SizeUtils.size - 1; i > 0 ; i-=2)
//		{
//			vector.remove(i);
//		}
//		
//	}
//	
//	@Test
//	public void getElementVector()
//	{
//		java.util.Vector<String> vector = new Vector<String>();
//		for (int i = 0; i < SizeUtils.size; i++)
//		{
//			vector.add("test" + i);
//		}
//		
//		
//		for (int i = SizeUtils.size - 1; i > 0 ; i-=2)
//		{
//			vector.get(i);
//		}
//		
//	}
//		
//	
}
