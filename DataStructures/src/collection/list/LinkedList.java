package collection.list;

/**
 * LinkedList has ability to behave like: 
 * Queue - LIFO
 * Dequeue - Double ended queue
 * Stack - FIFO
 * Double ended list
 * 
 * 
 * @author Bart88
 *
 * @param <E>
 */
public class LinkedList<E> implements List<E>
{
	private int size;

	private Node<E> first;
	private Node<E> last;

	public LinkedList()
	{
		size = 0;
		first = null;
		last = null;
	}

	/**
	 * Two direction linked list so Node need to have two pointers to point out previous and next element.
	 * 
	 * @param <E>
	 */
	private class Node<E>
	{
		Node<E> prev;
		E item;
		Node<E> next;

		public Node(Node<E> prev, E element, Node<E> next)
		{
			this.prev = prev;
			this.item = element;
			this.next = next;
		}
	}

	public E getFirst()
	{
		return null;
	}

	public E getLast()
	{
		return null;
	}

	/**
	 * Most important part of this data structure.
	 * 
	 * @param element
	 */
	public void addFirst(E element)
	{
		Node<E> tmpNext = first;
		Node<E> newNode = new Node<E>(null, element, tmpNext);

		first = newNode;

		if (tmpNext == null)
			last = newNode;
		else
			tmpNext.prev = newNode;

		size++;
	}

	/**
	 * Most important part of this data structure.
	 * 
	 * @param element
	 */
	public void addLast(E element)
	{
		Node<E> tmpLast = last;
		Node<E> newNode = new Node<E>(tmpLast, element, null);

		last = newNode;

		if (tmpLast == null)
			first = newNode;
		else
			tmpLast.next = newNode;

		size++;
	}

	@Override
	public void add(E element)
	{
		addLast(element);
	}

	public void addBefore()
	{
		// TODO
	}

	@Override
	public void add(int index, E element)
	{
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Illegal Argument Exception - index = " + index);

		if (index == size)
			addLast(element);
		else
			addBefore();
	}

	@Override
	public E get(int index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index, E element)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(int index)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty()
	{
		if (size == 0)
			return true;

		return false;
	}

	@Override
	public int size()
	{
		return size;
	}

	// MAIN to test some functionality
	public static void main(String[] args)
	{
		addMethodTest();
	}

	// --- TESTS ---
	public static void addMethodTest()
	{
		LinkedList<String> linkedList = new LinkedList<String>();

		boolean isEmpty = linkedList.isEmpty();

		linkedList.addLast("test3");
		linkedList.addLast("test4");
		linkedList.addLast("test5");

		isEmpty = linkedList.isEmpty();

		int size = linkedList.size();

		linkedList.addFirst("test2");
		linkedList.addFirst("test1");

		linkedList.addLast("test6");
	}

}
