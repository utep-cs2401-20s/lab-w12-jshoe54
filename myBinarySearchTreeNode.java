package myBinarySearchTreeNode;

class myBinarySearchTreeNode{
	  int myValue;
	  myBinarySearchTreeNode left;
	  myBinarySearchTreeNode right;
	    
	  myBinarySearchTreeNode(int inValue){
	    // created a new node with empty child pointers
		  myValue=inValue;
		  	left = right= null;	
	  }
	  myBinarySearchTreeNode root;
	  
	  myBinarySearchTreeNode(){
		  root=null;
	  }
	  myBinarySearchTreeNode(int[] A){
	    // creates a new Binary Search Tree rooted at the first value in the array
	    /// by inserting elements into the tree in the order they are given in A.
		int i =1;
		myValue = A[0];
			while(i<A.length) {
				this.insert(A[i]);
				i++;
			}
		  	
		  	
	  }
	  
	  public void insert(int inValue){
	    // This method takes a new integer as input and decides 
	    // if it should be place: 
	    //    * as the left child,
	    //    * as the right child, 
	    //    * in the left subtree,
	    //    * or in the right subtree.
	    // If the value already exists in the tree, no action is taken.
		  root=inLeaf(root,inValue);
	  }
			myBinarySearchTreeNode inLeaf(myBinarySearchTreeNode root, int inValue) {
				if(root==null) {
					root=new myBinarySearchTreeNode(inValue);
					return root;
				}
				if(inValue<root.myValue) {
					root.left=inLeaf(root.left, inValue);
				}
				else if(inValue>root.myValue) {
					root.right=inLeaf(root.right, inValue);
				}
				return root;
			}
	  
	  public int height(){//Isaac Beltran helped me with the height, depth, and size methods 
	     // This method recursively calculates the height of the entire (sub)tree.
	     // This method will take O(n) time
		  int Lheight =0;
		  int Rheight =0;
		  	if(left!=null) {
		  		Lheight=left.height();
		  	}
		  	if(right!=null) {
		  		Rheight=right.height();
		  	}
		  	return Math.max(Lheight,Rheight)+1;
	  }
	  
	  public int depth(int search){
	     // This method recursively calculates the depth of a given search value. 
	     // If the given value is not in the tree, this method returns -1. 
	     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
	     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
	     // (i.e. the number of recursive calls).
		  int sum = 1;
		    if (search < myValue) {
		      if (left != null) {
		        return sum + left.depth(search);
		      }
		    }
		    if (search > myValue) {
		      if (right != null) {
		        return sum + right.depth(search);
		      }
		    }
		    if (search == myValue) {
		      return sum - 1;
		    }
		    return -2 - sum;
		   
		  }
	  
	  public int size(){
	     // This method recursively calculates the number of nodes in the (sub)tree.
		  int sum = 1;
		    if(left != null) {
		     
		    sum += left.size();
		    }
		    if(right != null) {
		      sum += right.size();
		    }
		   
		    return sum;
		  }
	  
	} 