package general;

public class BST {
	public Node root;
	public int array[];
	public int length;
	
	class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	public BST() {
		array = new int[1000];
		length = 0;
		root = null;
	}
	
	void add(Node node, int data) {
		
		if(root == null) { root = new Node(data); return; }
		if(data < node.data) {
			if(node.left == null) {
				node.left = new Node(data);
				return;
			}
			else add(node.left, data);
		}
		else {
			if ( node.right == null )	{
				node.right = new Node(data);
				return;
			}
			else add(node.right, data);
		}
		/*Node node = new Node(data);
		if(root == null) { 
			root = node;
			return;
		}
		insert(root, node);*/
	}
	
	void insert(Node latestRoot, Node node) {
		
		if(node.data < latestRoot.data) {
			if ( latestRoot.left == null )	{
				latestRoot.left = node;
				return;
			}
			else insert(latestRoot.left, node);
		}
		else {
			if ( latestRoot.right == null )	{
				latestRoot.right = node;
				return;
			}
			else insert(latestRoot.right, node);
		}
		
	}

	public void display(Node root){
		if(root != null){
			display(root.left);
			System.out.print(root.data + " ");
			display(root.right);
		}
	}
	
	public void inorder(Node root){
		if(root != null){
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	public void preorder(Node root){
		if(root != null){
			System.out.print(root.data + " ");
			preorder(root.left);	
			preorder(root.right);
		}
	}
	
	public void postorder(Node root){
		if(root != null){
			postorder(root.left);			
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	boolean identicalTrees(Node a, Node b) {
        
        /*1. both empty */
        if (a == null && b == null) {
            return true;
        }
 
        /* 2. both non-empty -> compare them */
        if (a != null && b != null) {
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));
        }
 
        /* 3. one empty, one not -> false */
        return false;
    }
	
	void allPaths(Node root, int array[], int length) {
		if(root == null) return;
		array[length++] = root.data;
		if(root.left == null && root.right == null) {
			for(int i=0; i<length; i++) System.out.print(array[i] + " ");
			System.out.println("Path completed");
		}
		allPaths(root.left, array, length);
		allPaths(root.right, array, length);
	}
}



/*


import java.util.*;


public class Runner
{
  
  public static void main(String[] args)
  {
    
    BST bst1 = new BST();
    bst1.add(bst1.root, 2);
    bst1.add(bst1.root, 1);
    bst1.add(bst1.root, 3);
    bst1.display(bst1.root); System.out.println(" display");
    //bst1.preorder(bst1.root); System.out.println(" preorder");
    //bst1.inorder(bst1.root); System.out.println(" inorder");
    //bst1.postorder(bst1.root); System.out.println(" postorder");
    
    BST bst2 = new BST();
    bst2.add(bst2.root, 2);
    bst2.add(bst2.root, 1);
    bst2.add(bst2.root, 3);
    bst2.display(bst2.root); System.out.println(" display");
    //bst2.preorder(bst2.root); System.out.println(" preorder");
    //bst2.inorder(bst2.root); System.out.println(" inorder");
    //bst2.postorder(bst2.root); System.out.println(" postorder");
    
    System.out.println("Equal ?= " + bst1.identicalTrees(bst1.root, bst2.root));
  }
}


public class Node
{
	int data;
	Node left, right, link;
  
  public Node(int data) {
   
    this.data = data;
    left = right = link = null;
  }
}

public class BST {

	Node root;
  
  	public BST() {
    	
      root = null;
    }
  
  	
  public void add(Node cur, int data) {
   
    if(root == null) { root = new Node(data); return; }
    
    if( data < cur.data ) {
      
      if(cur.left == null) cur.left = new Node(data); 
      else	add(cur.left, data);
      
    } else {
      	
      	if(cur.right == null) cur.right = new Node(data);
      	else add(cur.right, data);
    }
  }
  
  
  void display(Node cur) {
   
    if(cur != null) {
  		
      display(cur.left);
	  System.out.print(cur.data + " ");
	  display(cur.right);
    }
  }
  
  void preorder(Node cur) {
   
    if(cur != null) {
  		
      System.out.print(cur.data + " ");
      display(cur.left);
	  display(cur.right);
    }
  }
  
  void inorder(Node cur) {
   
    if(cur != null) {
  		
	  display(cur.left);
	  System.out.print(cur.data + " ");
	  display(cur.right);
    }
  }
  
  void postorder(Node cur) {
   
    if(cur != null) {
  		
      display(cur.left);
      display(cur.right);
	  System.out.print(cur.data + " ");
    }
  }
  
  boolean identicalTrees(Node a, Node b) {
        
        //*1. both empty
        if (a == null && b == null) {
            return true;
        }
 
        //* 2. both non-empty -> compare them
        if (a != null && b != null) {
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));
        }
 
        /* 3. one empty, one not -> false
        return false;
    }
  
}


*/