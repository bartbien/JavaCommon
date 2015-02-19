package collection.hashcode;

import java.util.List;

public class HashCodeExample
{
	public static void arrayHashCode()
	{// initializing float array
		float[] fval = new float[]
		{ 32.1f, 55.4f };

		// hashcode for value1
		int retval = fval.hashCode();

		// printing hash code value
		System.out.println("The hash code of value1 is: " + retval);

		// value2 for double array
		fval = new float[]
		{ 11.2f, 78.4f };

		// hashcode for value2
		retval = fval.hashCode();

		// printing hash code value
		System.out.println("The hash code of value2 is: " + retval);
	}

	public static void stringHashCode()
	{
		String Str = new String("Welcome to Tutorialspoint.com");
		System.out.println("Hashcode for Str :" + Str.hashCode());
	}

	public static void arrayListHashCode()
	{
		// initializing Object array
		Object[] ob = new Object[]
		{ 22, 7 };

		// hashcode for value1
		int retval = ob.hashCode();

		// printing hash code value
		System.out.println("The hash code of value1 is: " + retval);

		// value2 for Object array
		ob = new Object[]
		{ 3.5, 8.5 };

		// hashcode for value2
		retval = ob.hashCode();

		// printing hash code value
		System.out.println("The hash code of value2 is: " + retval);

		List<String> list = new java.util.ArrayList<String>();
		list.add("test");
		list.add("test2");

		list.hashCode();
	}

	public static void main(String args[])
	{
		arrayHashCode();
	}
}
