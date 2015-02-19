package collection.stack;

/**
 * By plain means on specify type in this case String
 * 
 * @author Bart88
 *
 */
public class StackPlain
{
	/**
	 * Stack size.
	 */
	private int size;

	/**
	 * Top of stack.
	 */
	private Node first;

	public StackPlain()
	{
		this.size = 0;
		this.first = null;
	}

	private static class Node
	{
		private String item;
		private Node next;

		public Node()
		{

		}
	}

	public void push(String item)
	{
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		size++;
	}

	public static void main(String[] args)
	{
		StackPlain s = new StackPlain();

		s.push("test1");
		s.push("test2");
		s.push("test3");
		s.push("test4");

	}
}
