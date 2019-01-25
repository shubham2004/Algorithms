import java.io.*;
import java.util.*;

class stack1
{
	List<Integer> l1=new ArrayList<Integer>();
	//method inserting data in stack
	List<Integer> insert(int a)
	{
		l1.add(a);
		return l1;
	}
	// method to remove last data from stack
	void remove()
	{
		l1.remove(l1.size()-1);
	}
	//method delete stack
	void delete()
	{
		l1.removeAll(l1);
	}
	// method print stack
	void print()
	{
		System.out.println(l1);
	}
	
	
}

public class stack {
	public static void main(String[] args)
	{
		stack1 s=new stack1();
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		s.print();
		s.remove();
		s.print();
		
	}

}
