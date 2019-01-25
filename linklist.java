import java.io.*;
import java.util.*;

class Link
{
	//this is a simple link list class where we have a link list node next to point next link and a data node
	// next link is use to point next link in the link list
	Link next;
	int data;
	//constructor
	Link()
	{
		next=null;
		data=0;
	}
	// constructor with initialization
	Link(int a)
	{
		data=a;
		next=null;
	}
}

// this is the operation call which has operation related to link list
class operation
{
	// printing a link list... as it is a tangled list each next link is the next node in the link list so
	// if you print one link it will automatically print all next links.
	// here we use recursive call untill the end of the link list as the last node will have null as next pointer
	void print(Link l1)
	{
		if(l1.next!=null)
		{
			System.out.print(l1.data +" ");
			print(l1.next);
			
		}
		else
		{
		System.out.print(l1.data +" ");
		System.out.println();
		}
		
		
	}
	// inserting a link between two link list with data....we have to change the pointer of previous link to
	// this link and new link next header or pointer to the next link
	void insert(Link prevlink,Link nextlink,int data)
	{
		Link newlink=new Link();
		prevlink.next=newlink;
		newlink.data=data;
		newlink.next=nextlink;
		
		
	}
	
}
public class LinkList {
	public static void main(String[] args)
	{
		Link l1=new Link(1);
		Link l2=new Link(2);
		Link l3=new Link(3);
		Link l4=new Link(4);
		// linking list list
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		operation o=new operation();
		o.print(l1);
		o.insert(l2,l3,16);
		o.print(l1);
		
		
			
	}

}
