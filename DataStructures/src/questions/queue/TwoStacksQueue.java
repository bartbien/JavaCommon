package questions.queue;

import java.util.Stack;

/**
 * Queue builded from two stacks.
 * 
 * @author Bart88
 *
 * @param <E>
 */
public class TwoStacksQueue<E>
{

	private Stack<E> inbox = new Stack<E>();
	private Stack<E> outbox = new Stack<E>();

	public void queue(E item)
	{
		inbox.push(item);
	}

	public E dequeue()
	{
		if (outbox.isEmpty())
		{
			while (!inbox.isEmpty())
			{
				outbox.push(inbox.pop());
			}
		}
		return outbox.pop();
	}

	public static void main(String[] args)
	{
		TwoStacksQueue<String> queue = new TwoStacksQueue<String>();
		queue.queue("test1");
		queue.queue("test2");

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}