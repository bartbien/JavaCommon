package performance.jdk.collection.maps;

import java.util.TreeMap;

import org.junit.Test;

import performance.jdk.collection.runner.SizeUtils;
import utils.CommonUtils;

/**
 * <pre>
 * unlike a hash map, a tree map guarantees that its elements will be sorted in ascending key order.
 * 
 * {test0=0, test1=1, test10=10, test11=11, test12=12, test13=13, test14=14, test15=15, test16=16, test17=17, test18=18, test19=19, test2=2, test20=20, test21=21, test22=22, test23=23, test24=24, test25=25, test26=26, test27=27, test28=28, test29=29, test3=3, test30=30, test4=4, test5=5, test6=6, test7=7, test8=8, test9=9}
 * 
 * @author BartBien
 *
 */
public class TreeMapTest
{

	@Test
	public void addArrayList()
	{
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		for (int i = 0; i < SizeUtils.size; i++)
		{
			treeMap.put("test" + i, Integer.valueOf(i));
		}
	}
}
