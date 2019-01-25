import java.io.*;
import java.util.*;

public class ListCode {
	void insert(int i)
	{
		
	}
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		List<Integer> l1=new ArrayList<Integer>();
		//inserting element
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		//displaying element
		System.out.println(l1);
		//deleting element
		l1.remove(1);
		System.out.println(l1);
		System.out.println(l1.size());
		
	}

}
