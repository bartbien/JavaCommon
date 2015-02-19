package performance.jdk.collection.maps;

import java.util.HashMap;
import java.util.TreeMap;

import org.junit.Test;

import performance.jdk.collection.runner.SizeUtils;
import utils.CommonUtils;

/**
 * <pre>
 * The HashMap class uses a hashtable to implement the Map interface. 
 * This allows the execution time of basic operations, such as get( ) and put( ), 
 * to remain constant even for large sets.
 * 
 * {test16=16, test15=15, test14=14, test13=13, test35=35, test12=12, test34=34, test11=11, test33=33, test10=10, test32=32, test31=31, test0=0, test1=1, test19=19, test18=18, test17=17, test30=30, test27=27, test26=26, test25=25, test24=24, test23=23, test22=22, test21=21, test20=20, test29=29, test28=28, test4=4, test5=5, test2=2, test3=3, test8=8, test9=9, test6=6, test7=7}
 * 
 * @author BartBien
 *
 */
public class HashMapTest
{

	@Test
	public void addArrayList()
	{
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < SizeUtils.size; i++)
		{
			hashMap.put("test" + i, Integer.valueOf(i));
		}
	}
}
