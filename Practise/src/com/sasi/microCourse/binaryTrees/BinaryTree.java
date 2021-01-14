package com.sasi.microCourse.binaryTrees;

import java.util.Scanner;

public class BinaryTree {
	
	private class Node 
	{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	//size represents the total nodes in the tree
	private int size;
	
	public BinaryTree ()
	{
		this.root = takeInput(new Scanner(System.in), null, true);
	}
	
	// parent denotes the value of parent node
	// ilc denotes -> the left child is present
	public Node takeInput(Scanner sc, Node parent, boolean ilc )
	{
		if(parent==null)
		{
			System.out.println("Root node data...?");
		}
		else
		{
			if(ilc)
			{
				System.out.println("Enter the left child data" +" "+parent.data);
			}
			else
			{
				System.out.println("Enter the left child data" +" "+parent.data);
			}
		}
		
	    int val = sc.nextInt();
	    
	    Node node = new Node();
	    
	    node.data = val;
	    
	    this.size++;
	   
	    System.out.println(node.data+" "+"has left child ?");
	    boolean hlc =  sc.nextBoolean();
	    
	    if(hlc)
	    {
	    	node.left=takeInput(sc, node, true);
	    }
	    
	    System.out.println(node.data+" "+"has right child ?");
	    boolean hrc = sc.nextBoolean();
	    if(hrc)
	    {
	    	node.right=takeInput(sc, node, false);
	    }
	    
		return node;
	}
	
	public void display() 
	{
		System.out.println("---------------------------------");
		display(this.root);
		System.out.println("---------------------------------");
	}

	private void display(Node node)
	{
		
		if(node==null)
		{
			return;
		}
		String str ="";
		if(node.left==null)
		{
			str+=".";
		}
		else
		{
			str+=node.left.data;
		}
		
		str+="=>" + node.data + "<="; 
		
		if(node.right==null)
		{
			str+=".";
		}
		else
		{
			str+=node.right.data;
		}
		System.out.println(str);
		
		display(node.left);
		display(node.right);
		
	}
	
	
}


