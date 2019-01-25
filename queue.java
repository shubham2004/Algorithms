import java.io.*;
import java.util.*;
class queue1
{
	List<Integer> l1=new ArrayList<Integer>();
	//method to insert element in the queue one after other
	List<Integer> insert(int a)
	{
		l1.add(a);
		return l1;
	}
	// removing first element of the queue
	List<Integer> remove()
	{
		l1.remove(0);
		return l1;
	}
	// method to show list
	void print()
	{
		System.out.println(l1);
	}
	// delete data from queue
	void delete()
	{
		l1.removeAll(l1);
	}
}
public class queue {
	public static void main(String[] args)
	{
		queue1 q=new queue1();
		//adding data to the queue one after another
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.print();
		//removing first element of the queue
		q.remove();
		q.print();
		// deleting queue
		q.delete();
		q.print();
	}

}
