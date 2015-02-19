package jdk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class JDKCollectionExample
{
	public JDKCollectionExample()
	{

	}

	private void collectionExamples()
	{
		// ------------------------------------------------------------
		// ------------------------------------------------------------
		// ---------------------- LIST<E> ----------------------------
		// ------------------------------------------------------------
		// ------------------------------------------------------------

		// interfaces java.util
		List<String> list;

		// classes java.util - not synchronized
		// transient Object[] elementData;
		// same as Vector but Vector is synchronized
		ArrayList<String> arrayList;

		// double ended list - next and prev linked by Nodes as below
		// Node(Node<E> prev, E element, Node<E> next)
		LinkedList<String> linkedList;
		
		// This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue. 
		//
		java.util.ArrayDeque<String> arrayDeque;

		// AWT collection - a little different VECTOR :) - List in awt based on Vector
		java.awt.List listAWT;

		// grow able array of objects - synchronized
		// almost the same as the ArrayList difference is the ArrayList isn't synchronized
		// protected Object[] elementData;
		java.util.Vector<String> vector;
		
		// ------- STACK
		// LIFO - extended Vector - read synchronized structure
		// protected Object[] elementData;
		java.util.Stack<String> stack;

		// ------------------------------------------------------------
		// ------------------------------------------------------------
		// ---------------------- QUEUE<E> ----------------------------
		// ------------------------------------------------------------
		// ------------------------------------------------------------

		// element insertion and removal at both ends
		// deque is short for double ended queue
		java.util.Deque<String> deque;

		// FIFO
		// typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner
		java.util.Queue<String> queue;

		// ------------------------------------------------------------
		// ------------------------------------------------------------
		// ---------------------- MAP<K,V> ----------------------------
		// ------------------------------------------------------------
		// ------------------------------------------------------------
		/**
		 * <p>
		 * This interface takes the place of the Dictionary class
		 * <p>
		 * An object that maps keys to values.
		 */
		java.util.Map<Integer, String> map;

		/**
		 * 
		 */
		//java.util.NavigableMap<K, V>
		
		/**
		 * 
		 */
		//java.util.AbstractMap<K, V>
		
		/**
		 * <p>
		 * stored as Node(int hash, K key, V value, Node<K,V> next)
		 * 
		 * <p>
		 * This implementation provides constant-time performance for the basic operations (get and put), assuming the
		 * hash function disperses the elements properly among the buckets.
		 * 
		 * <pre>
		 * almost the same as Hashtable
		 * public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, java.io.Serializable
		 * </pre>
		 * 
		 */
		java.util.HashMap<Integer, String> hashMap;

		/**
		 * <p>
		 * A Red-Black tree based NavigableMap implementation.
		 * 
		 * <p>
		 * This implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations.
		 * Algorithms are adaptations of those in Cormen, Leiserson, and Rivest's Introduction to Algorithms.
		 * 
		 * <pre>
		 * static final class Entry<K,V> implements Map.Entry<K,V> {
		 *         K key;
		 *         V value;
		 *         Entry<K,V> left = null;
		 *         Entry<K,V> right = null;
		 *         Entry<K,V> parent;
		 *         boolean color = BLACK;
		 * </pre>
		 */
		TreeMap<Integer, String> treeMap;

		/**
		 * <p>
		 * Hash table and linked list implementation of the Map interface, with predictable iteration order.
		 * <p>
		 * This implementation spares its clients from the unspecified, generally chaotic ordering provided by HashMap
		 * (and Hashtable), without incurring the increased cost associated with TreeMap
		 * 
		 * <pre>
		 * 		public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
		 * </pre>
		 */
		java.util.LinkedHashMap<Integer, String> linkedHashMap;

		// ------------------------------------------------------------
		// ------------------------------------------------------------
		// ---------------------- Set<E> ----------------------------
		// ------------------------------------------------------------
		// ------------------------------------------------------------
		/**
		 * <p>
		 * A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2
		 * such that e1.equals(e2),
		 * 
		 * <pre>
		 * 
		 * </pre>
		 * 
		 */
		// java.util.Set<E> set;

		/**
		 * 
		 */
		// java.util.NavigableSet<E> navigableSet;

		/**
		 * 
		 */
		// java.util.NavigableMap<K, V> navigableMap;

		/**
		 * <p>
		 * A NavigableSet implementation based on a TreeMap. The elements are ordered using their natural ordering, or
		 * by a Comparator provided at set creation time, depending on which constructor is used.
		 * 
		 * <p>
		 * based on private transient NavigableMap<E,Object> m;
		 * 
		 */
		// java.util.TreeSet<E> treeSet;

		/**
		 * <p>
		 * based on private transient HashMap<E,Object> map;
		 */
		// java.util.HashSet<String> hashSet;

		// ------------------------------------------------------------
		// ---------------------- ? ----------------------------
		// ------------------------------------------------------------

		// Since:JDK1.0 - synchronized
		// recommended to use HashMap<K, V> or ConcurrentHashMap<K, V>
		// based Entry(int hash, K key, V value, Entry<K,V> next)
		java.util.Hashtable<Integer, String> hashtable;

		// Since:JDK1.0 - Abstract class
		// NOTE: This class is obsolete. New implementations should implement the Map interface, rather than extending
		// this class.
		java.util.Dictionary<Integer, String> dictionary;

		// In a priority queue, an element with high priority is served before an element with low priority.
		// just as a list can be implemented with a linked list or an array, a priority queue can be implemented with a
		// heap
		PriorityQueue<String> priorityQueue;

		Character cha;
		Integer in;
		Double db;
	}

	public static void main(String[] args)
	{
		// arrayListTests();
		// linkedListTests();

		// priorityQueueTest();

		// copyArrayTest();

		differentTypeCollectionTest();

	}

	private static void differentTypeCollectionTest()
	{
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add("test");
		ll.add(1);
		ll.add(true);
		ll.add(2.888);

		LinkedList<TreeMap<ArrayList<String>, ArrayList<LinkedList<String>>>> monesterTest = new LinkedList<TreeMap<ArrayList<String>, ArrayList<LinkedList<String>>>>();

		List<Object> al = new ArrayList<Object>();
		al.add("test");
		al.add(1);
		al.add(true);
		al.add(2.888);
		al.add(al);
		al.add(ll);

	}

	public static void priorityQueueTest()
	{
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

		for (int j = 0; j < 5; j++)
		{
			priorityQueue.add("test" + j);
		}

		priorityQueue.remove();
	}

	public static void linkedListTests()
	{
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.addLast("test3");
		linkedList.addLast("test4");
		linkedList.addLast("test5");

		linkedList.addFirst("test2");
		linkedList.addFirst("test1");

		linkedList.addLast("test6");

	}

	public static void arrayListTests()
	{
		// ArrayList<String> arrTest = new ArrayList<String>(20);
		ArrayList<String> arrTest = new ArrayList<String>();

		for (int i = 0; i < 5; i++)
		{
			arrTest.add("test" + i);
		}

		arrTest.remove(1);

		arrTest.add("test" + 6);
	}

	// Test of copyArray method
	public static void copyArrayTest()
	{
		int arrayTest[] =
		{ 0, 1, 2, 3, 4, 5 };

		int arrayTest2[] =
		{ 0, 0, 0, 0, 0, 0 };

		int size = 6;
		int index = 4;
		int length = size - index;

		// native method JNI (should be efficient and fast)
		// make exactly one cell at the index position for adding new element
		System.arraycopy(arrayTest, index, arrayTest2, index, length);

		System.out.print(true);

		// -----------------------------------
		int arr1[] =
		{ 0, 1, 2, 3, 4, 5 };
		int arr2[] =
		{ 0, 0, 0, 0, 0, 0 };

		// copies an array from the specified source array
		System.arraycopy(arr1, 3, arr2, 3, 1);
		// array2 = 0 0 0 3 0 0

		System.out.print("array2 = ");
		System.out.print(arr2[0] + " ");
		System.out.print(arr2[1] + " ");
		System.out.print(arr2[2] + " ");
		System.out.print(arr2[3] + " ");
		System.out.print(arr2[4] + " ");
		System.out.print(arr2[5] + " ");
	}

}
