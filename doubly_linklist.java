import java.io.*;
import java.util.*;

class Linkdoubly
{
	Linkdoubly next;
	Linkdoubly prev;
	int data;
	Linkdoubly()
	{
		next=null;
		prev=null;
		data=0;
	}
	Linkdoubly(int d)
	{
		next=null;
		prev=null;
		data=d;
	}
}
class operationdoubly
{
	void printforward(Linkdoubly l1)
	{
		if(l1.next != null)
		{
			System.out.print(l1.data);
			printforward(l1.next);
		}
		else
		{
			System.out.print(l1.data);
			System.out.println();
		}
	}
	
	void printback(Linkdoubly l1)
	{
		if(l1.prev != null)
		{
			System.out.print(l1.data);
			printback(l1.prev);
		}
		else
		{
			System.out.print(l1.data);
			System.out.println();
		}
	}
	
	void insert(Linkdoubly prevlink,Linkdoubly nextlink,int d)
	{
		Linkdoubly newlink=new Linkdoubly();
		newlink.data=d;
		newlink.prev=prevlink;
		newlink.next=nextlink;
		prevlink.next=newlink;
		nextlink.prev=newlink;
	}
	
}
public class DoublyLinkList {
	public static void main(String[] args)
	{
		Linkdoubly l1=new Linkdoubly(1);
		Linkdoubly l2=new Linkdoubly(2);
		Linkdoubly l3=new Linkdoubly(3);
		Linkdoubly l4=new Linkdoubly(4);
		Linkdoubly l5=new Linkdoubly(5);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		
		l5.prev=l4;
		l4.prev=l3;
		l3.prev=l2;
		l2.prev=l1;
		
		
		operationdoubly o=new operationdoubly();
		System.out.println("printing list in forward direction");
		o.printback(l5);
		System.out.println("printing list in backward direction");
		o.printforward(l1);
		
	}

}
