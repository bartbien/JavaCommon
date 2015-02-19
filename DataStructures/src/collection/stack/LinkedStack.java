package collection.stack;

import java.util.NoSuchElementException;

/**
 * LIFO stack - linked stack - without array holder. <br>
 * This implementation uses a singly-linked list, <br>
 * see Node nested class - Node{@code <E>}  with two fields E item and Node{@code <E>} next.<br>
 * 
 * @author Bart88
 *
 * @param <E>
 *            the type of elements in this stack
 */
public class LinkedStack<E>
{
	/**
	 * Stack size.
	 */
	private int size;

	/**
	 * Top of stack.
	 */
	private Node<E> first;

	public LinkedStack()
	{
		this.size = 0;
		this.first = null;
	}

	/**
	 * @param <E>
	 *            the type of elements in this node
	 */
	private static class Node<E>
	{
		private E item;
		private Node<E> next;

		public Node()
		{

		}
	}

	/**
	 * 
	 * @param item
	 *            to be pushed onto this stack
	 */
	public void push(E item)
	{
		Node<E> oldFirst = first;
		first = new Node<E>();

		first.item = item;
		first.next = oldFirst;

		size++;
	}

	/**
	 * Removes item from top of stack
	 * 
	 * @throws java.util.NoSuchElementException
	 *             - if stack is empty
	 */
	public void pop()
	{
		if (isEmpty())
			throw new NoSuchElementException("Empty stack");

		Node<E> oldFirst = first;

		first = null;
		size--;

		first = oldFirst.next;
	}

	/**
	 * Return item from top of stack (doesn't remove like pop())
	 * 
	 * @throws java.util.NoSuchElementException
	 *             - if stack is empty
	 */
	public Node<E> peek()
	{
		if (isEmpty())
			throw new NoSuchElementException("Empty stack");

		return first;
	}

	public boolean isEmpty()
	{
		if (size == 0)
			return true;

		return false;
	}

	/**
	 * Simply test of stack method.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		LinkedStack<String> s = new LinkedStack<String>();

		s.push("test1");
		s.push("test2");

		// false
		s.isEmpty();

		System.out.println("Item ontop -> " + s.peek().item);
		System.out.println("Next Item -> " + s.peek().next.item);

		s.pop();
		s.pop();

		s.push("test3");
		s.push("test4");

		System.out.println("Item ontop -> " + s.peek().item);
		System.out.println("Next Item -> " + s.peek().next.item);

		s.pop();
		s.pop();

		// null exception - empty stack
		// s.pop();

		// null exception - empty stack
		// System.out.println("Item ontop -> " + s.peek().item);
		// System.out.println("Next Item -> " + s.peek().next.item);

		// true
		s.isEmpty();
	}
}
