package collection.list;

/**
 * 
 * @author Bart88
 *
 * @param <E>
 */
public class ArrayList<E> implements List<E>
{
	private Object[] arrayElements;

	private static final int MINIUMUM_CAPACITY = 10;

	private int size;

	public ArrayList()
	{
		arrayElements = new Object[MINIUMUM_CAPACITY];
		size = 0;
	}

	public ArrayList(int initCapacity)
	{
		if (initCapacity < 0)
			throw new IllegalArgumentException("Illegal capacity " + initCapacity);

		arrayElements = new Object[initCapacity];
		size = 0;
	}

	/**
	 * Max int size is 2147483647 = 2<sup>31</sup>-1.
	 */
	public void grow()
	{
		Object[] tmpArrayElements = arrayElements;

		int oldCapacity = arrayElements.length;
		int newCapacity = oldCapacity + (oldCapacity / 2);

		arrayElements = new Object[newCapacity];

		for (int i = 0; i < tmpArrayElements.length; i++)
		{
			arrayElements[i] = tmpArrayElements[i];
		}
	}

	public void ensureCapacity()
	{
		if (size >= arrayElements.length)
			grow();
	}

	/**
	 * Make sure that index is qualify for further operation.
	 * 
	 * @param index
	 */
	public void rangeCheck(int index)
	{
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException("Out of bounds");
	}

	@Override
	public void add(E element)
	{
		ensureCapacity();

		arrayElements[size] = element;
		size++;
	}

	@Override
	public void add(int index, E element)
	{
		++size;
		ensureCapacity();

		rangeCheck(index);

		// the number of elements to be copied
		int length = size - index;

		// native method JNI (should be efficient and fast)
		// make exactly one cell at the index position for adding new element
		System.arraycopy(arrayElements, index, arrayElements, index + 1, length);

		arrayElements[index] = element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index)
	{
		return (E) arrayElements[index];
	}

	@Override
	public void set(int index, E element)
	{
		rangeCheck(index);

		arrayElements[index] = element;
	}

	@Override
	public void remove(int index)
	{
		rangeCheck(index);

		// the number of elements to be copied
		int length = size - 1 - index;

		// remove element by override the index position
		// with array elements
		System.arraycopy(arrayElements, index + 1, arrayElements, index, length);

		arrayElements[--size] = null;
	}

	@Override
	public boolean isEmpty()
	{
		if (size == 0)
		{
			return true;
		}

		return false;
	}

	@Override
	public int size()
	{
		return size;
	}

	// ------------------------------------------------
	// ---- MAIN only for tests -----------------------
	// ------------------------------------------------

	public static void main(String[] args)
	{
		// TEST functionality below to invoke method
		ArrayList<String> arrayList = new ArrayList<String>();

		for (int i = 0; i < 5; i++)
		{
			arrayList.add("test" + i);
		}

		addIndexTest();
	}

	// ------------------------------------------------
	// ---- TESTS OF FUNCTIONLITY FOR DEBUG MODE ------
	// ------------------------------------------------

	public static void initialCapacityTest()
	{
		ArrayList<String> arrayList = new ArrayList<String>(-20);
	}

	public static void addTest()
	{
		ArrayList<String> arrayList = new ArrayList<String>();

		for (int i = 0; i < 5; i++)
		{
			arrayList.add("test" + i);
		}
	}

	public static void addIndexTest()
	{
		ArrayList<String> arrayList = new ArrayList<String>();

		for (int i = 0; i < 5; i++)
		{
			arrayList.add("test" + i);
		}

		arrayList.set(2, "setTest");
		String getTest = arrayList.get(2);

		arrayList.add(3, "add at specify index test");
	}

	public static void removeTest()
	{
		ArrayList<String> arrayList = new ArrayList<String>();

		for (int i = 0; i < 5; i++)
		{
			arrayList.add("test" + i);
		}

		arrayList.remove(2);

		arrayList.add("test" + 6);
	}
}
