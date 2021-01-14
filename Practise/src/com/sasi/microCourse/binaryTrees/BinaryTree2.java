package com.sasi.microCourse.binaryTrees;

import java.util.Scanner;

public class BinaryTree2
{
	public static class Node 
	{
		int data;
		Node left;
		Node right;
	}
	
	

	private static Node create()
	{
		Node newNode = new Node();
		
		System.out.println("Enter the data you want to insert (-1 for no node)");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		if(x==-1)
		{
			return null;
		}
		else
		{
			newNode.data= x;
			System.out.println("Enter the left child" +" "+ x);
			newNode.left=create();
			System.out.println("Enter the right child" +" " + x);
			newNode.right=create();
			//now we have to establish the address of the node and need to store in root
			// new node will return address as 100
			return newNode;
		}
	}
	public static void main(String[] args)
	{
		// create function will return the address of the node, which is a pointer
		Node root=null;
		root=create();	
	}

}
