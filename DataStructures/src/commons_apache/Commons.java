package commons_apache;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.map.LinkedMap;


/**
 * http://commons.apache.org/proper/commons-collections/userguide.html#Map20Iteration
 * 
 * @author BartBien
 *
 */
public class Commons
{
	public static void main(String[] args)
	{
		BidiMap bidi = new TreeBidiMap();
		bidi.put("SIX", "6");
		bidi.get("SIX");  // returns "6"
		bidi.getKey("6");  // returns "SIX"
		bidi.removeValue("6");  // removes the mapping
		BidiMap inverse = bidi.inverseBidiMap();  // returns a map with keys and values swapped
		
		Bag bag = new HashBag();
		bag.add("ONE", 6);  // add 6 copies of "ONE"
		bag.remove("ONE", 2);  // removes 2 copies of "ONE"
		bag.getCount("ONE");  // returns 4, the number of copies in the bag (6 - 2)
		
		OrderedMap map = new LinkedMap();
		map.put("FIVE", "5");
		map.put("SIX", "6");
		map.put("SEVEN", "7");
		map.firstKey();  // returns "FIVE"
		map.nextKey("FIVE");  // returns "SIX"
		map.nextKey("SIX");  // returns "SEVEN"
		
//		IterableMap map1 = new HashedMap();
//		MapIterator it = map1.mapIterator();
//		while (it.hasNext()) {
//		  Object key = it.next();
//		  Object value = it.getValue();
//		  
//		  it.setValue(2);
//		}
	}
}
