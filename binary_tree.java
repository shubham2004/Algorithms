import java.io.*;
import java.util.Scanner;
class BTNode
{
	BTNode left,right;
	int data;
	BTNode()
	{
		left=null;
		right=null;
		data=0;
	}
	BTNode(int d)
	{
		left=null;
		right=null;
		data=d;
	}
	void setRight(BTNode n)
	{
		right=n;
	}
	void setLeft(BTNode n)
	{
		left=n;
	}
	void setData(int d)
	{
		data=d;
	}
	BTNode getRight()
	{
		return right;
	}
	BTNode getLeft()
	{
		return left;
	}
	int getData()
	{
		return data;
	}
}
// so the above code is for setting up a single node and all the functions that a node has
// now we will define a binary tree and its functions

class BT
{
	BTNode root;
	BT()
	{
		root=null;
	}
	
	boolean isEmpty()
	{
		return root==null;
	}
	void insert(int data)
	{
		root=insert(root,data);
	}
	private BTNode insert(BTNode node, int data)
	{
		if(node==null)
			node=new BTNode(data);
		else
		{
			if(node.getRight()==null)
				node.right=insert(node.right,data);
			else
				node.left= insert(node.left,data);
		}
		return node;
		
	}
	int countNodes()
	{
		return countNodes(root);
	}
	private int countNodes(BTNode r)
	{
		if(r==null)
			return 0;
		else
		{
			int l=1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}
	boolean search(int val)
	{
		return search(root,val);
	}
	private boolean search(BTNode r,int val)
	{
		if(r.getData()==val)
			return true;
		else
		{
			if(r.left != null)
				search(r.left,val);
			else
				search(r.right,val);
		}
		return false;
	}
	void inorder()
	{
		inorder(root);
	}
	private void inorder(BTNode r)
	{
		if(r != null)
		{
			inorder(r.getLeft());
			System.out.print(r.getData()+" ");
			inorder(r.getRight());
		}
	}
	public void postorder()
	{
		postorder(root);
	}
	private void postorder(BTNode r)
	{
		if(r !=null)
		{
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData()+" ");
		}
	}
	public void preorder()
	{
		preorder(root);
	}
	private void preorder(BTNode r)
	{
		if(r != null)
		{
			System.out.print(r.getData()+" ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}
	
}

public class BinaryTree {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		BT bt=new BT();
		
		System.out.println("Binary Tree Test\n");          
        char ch;        
        do    
        {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            	case 1 : 
            		System.out.println("Enter integer element to insert");
            		bt.insert( scan.nextInt() );                     
            		break;                          
            	case 2 : 
            		System.out.println("Enter integer element to search");
            		System.out.println("Search result : "+ bt.search( scan.nextInt() ));
            		break;                                          
            	case 3 : 
            		System.out.println("Nodes = "+ bt.countNodes());
            		break;     
            	case 4 : 
            		System.out.println("Empty status = "+ bt.isEmpty());
            		break;            
            	default : 
            		System.out.println("Wrong Entry \n ");
            		break;   
            }
            /*  Display tree  */ 
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
 
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y'); 
		
	}

}
