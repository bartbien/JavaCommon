package collection.jdk.usage;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample
{
	public static void hashCodeExample()
	{
		// create hash table
		Hashtable htable1 = new Hashtable();

		// put values in table
		htable1.put(1, "A");
		htable1.put(2, "B");
		htable1.put(3, "C");
		htable1.put(4, "D");
		htable1.put(5, "E");

		// get the hash code value
		System.out.println("Hash code value is :" + htable1.hashCode());
	}

	public static void hashTableExample()
	{
		// Create a hash map
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		Enumeration<String> names;
		String str;
		double bal;

		balance.put("Zara", new Double(3434.34));
		balance.put("Mahnaz", new Double(123.22));
		balance.put("Ayan", new Double(1378.00));
		balance.put("Daisy", new Double(99.22));
		balance.put("Qadir", new Double(-19.08));

		balance.hashCode();

		// Show all balances in hash table.
		names = balance.keys();
		while (names.hasMoreElements())
		{
			str = (String) names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();
		// Deposit 1,000 into Zara's account
		bal = ((Double) balance.get("Zara")).doubleValue();
		balance.put("Zara", new Double(bal + 1000));
		System.out.println("Zara's new balance: " + balance.get("Zara"));

	}

	public static void main(String args[])
	{
		// hashTableExample();
		hashCodeExample();
	}
}
