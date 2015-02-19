package performance.jdk.collection.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import performance.jdk.collection.lists.ArrayListTest;
import performance.jdk.collection.lists.LinkedListTest;
import performance.jdk.collection.lists.VectorTest;
import performance.jdk.collection.maps.HashMapTest;
import performance.jdk.collection.maps.HashTableTest;
import performance.jdk.collection.maps.TreeMapTest;
import performance.jdk.collection.sets.HashSetTest;
import performance.jdk.collection.sets.TreeSetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses
(
	{
// --------------- lists
	 ArrayListTest.class,
	 LinkedListTest.class,
	 VectorTest.class,

// ---------------- maps
	 TreeMapTest.class,
	 HashMapTest.class,
	 HashTableTest.class

// ---------------- sets
// HashSetTest.class,
// TreeSetTest.class
	}
)
public class RunnerSuite
{
	
}