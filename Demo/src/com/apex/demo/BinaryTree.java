package com.apex.demo;

//A binary tree node
class Node 
{
 int data;
 Node left, right;

 Node(int item) 
 {
     data = item;
     left = right = null;
 }
}

class BinaryTree 
{
  Node root;

 /* Compute the "maxDepth" of a tree -- the number of 
    nodes along the longest path from the root node 
    down to the farthest leaf node.*/
  
  int sumOfLeaf(Node node) 
 {
	  int sum = 0;
	 if(node == null)
		 return 0;
	 
	 if(node.left == null)// && node.right != null)
		 sum = sum+node.data;
	 
	 sum = sum+sumOfLeaf(node.left);
	int sumr = sum+sumOfLeaf(node.right);
	
	 return sum;
     
 }
   
 /* Driver program to test above functions */
  
 public static void main(String[] args) 
 {
     BinaryTree tree = new BinaryTree();

     tree.root = new Node(1);
     tree.root.left = new Node(10);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);

     tree.sumOfLeaf(tree.root);
     System.out.println(tree.sumOfLeaf(tree.root));
 }
}