//17.11 numberNodes  

/*
public void numberNodes() {
   //you want to somehow increase an interger, and replace
   //the number that is already in the box with the number
   //that just increased 
   numberNodes(overallRoot, 1);
}

public void numberNodes(IntTreeNode root, int n) {
   if (root != null) {
      root.data = n;
      numberNodes(root.left, n + 1);
      numberNodes(root.right, n + 1);
   }
}
*/

//17.12: removeLeaves  

/*
public void removeLeaves() {
   //this is an x = change(x) problem,
   //so for this problem, what you want to do, is you will want to 
   
   //this is a requirment, most of the time, when you are dealing with this
   //type of code (aka binary trees and binary search trees in general)
   overallRoot = removeLeaves(overallRoot);  
}

public IntTreeNode removeLeaves(IntTreeNode root) {
   if (root == null) {
      root = null;
   } else if (root.left == null && root.right == null) {
      root = null; //because in this case, it is a leave node, and in that
      //case, you will want it to be null  
   } else {
      //here you will want to increment throught the data, because you
      //have not ran into a case where you have a null root  
      removeLeaves(root.left);
      removeLeaves(root.right);
   }
   return root;
} 
*/

//17.14 completeToLevel  
public void completeToLevel(int n) {
   //this is an x = change(x) problem,
   //so for this problem, what you want to do, is you will want to 
   
   //this is a requirment, most of the time, when you are dealing with this
   //type of code (aka binary trees and binary search trees in general)
   overallRoot = completeToLevel(overallRoot);
}

public IntTreeNode removeLeaves(int n, IntTreeNode root) {
   if (n < 1) {
      throw new IllegalArgumentException();
   }
   if (n == 1) {
      return node;
   } else if (root == null);
      root = new IntTreeNode(-1); 
   } else {
      //here you will want to increment throught the data, because you
      //have not ran into a case where you have a null root  
      
      //if either of the two are null, you will go tot he else if statement next
      //and then there the empty node will turn into a new node with a -1 in it
      root.left = removeLeaves(root.left);
      root.right = removeLeaves(root.right);
   }
   return root;
} 

/* 
these are the three most common pieces of code when it comes to an x = change(x) problem

also for these problems, even though you are not changing some of the data, you still
want to increment through the data, so you do the

 
root.left = change(root.left);
and the 
root.right = change(root.right);

and the most common of all is
overallRoot = change(overallRoot);  

*/

//17.15 trim  

public void trim(int min, int max) {
   overallRoot = trim(overallRoot);
}

public void trim(int min, int max, IntTreeNode root) {
   if (root == null) {
      return null; //this code pops up very often when it comes to the object
      //oriented code with binary trees  
   } else if (root.data < min) {
      return trim(min, max, root.left);
   } else if (root.data > max) {
      return trim(min, max, root.right); //what happnes here is that
      //you are just skipping over the data, since you are not reassigning it back to
      //what it was before   
   } else {
      root.left = trim(min, max, root.left);
      root.right = trim(min, max, root.right);
      return root;
   }
}

//17.16 tighten  

public void tighten() {
   overallRoot = tighten(overallRoot);
}

public void tighten(IntTreeNode root) {
   if (root == null) {
      return null; //this code pops up very often when it comes to the object
      //oriented code with binary trees  
   } else if (root.left == null && root.right != null) {
      //we are not assiging this to anything, so we are just going to skip it
      return tighten(root);
   } else if (root.right == null && root.left != null) {
      //we are also not assiging this to anything as well,
      //so we are just going to skip it as well  
      return tighten(root);
   } else {
      root.left = trim(root.left);
      root.right = trim(root.right);
      return root;
   }
}

//17.17 combineWith 

//should return an IntTree and it should pass through another IntTree  
public IntTree combineWith(IntTree other) {
   //you want to be adding in the new roots of the tree
   t3.overallRoot = combineWith(overallRoot, other.overallRoot);
   return t3; //<-- this will happen once you are done with the recursive call
   
}

public IntTreeNode combineWith(IntTreeNode root1, IntTreeNode root2) {
   //IntTree t3 = new IntTree(); //<--- you will not need this because this is only if
   //you are returning a whole tree, but we are only returning one root  
   
   //once there are no more nodes to look at, you will want to return 
   //the whole tree
   
   //this right here is the base case; 
   if (root1 == null && root2 == null) {   
      //this code right here pops up very often, where you
      //want to return null if the roots are null, 
      //unless if the code asks you to add something to a null root
      return null; 
   } else if (root1.left == null && root2.left != null) {
      root3 = new IntTreeNode(1);
      //because the first root is null, then you will want to go to the second
      root2.left 
      root2.right
   } else if (root1.right != null && root2.right == null) {
      root3 = new IntTreeNode(2); //what happnes here is that
      //because the second root is null, you will want to go to the first one  
      root1.left = 
      root1.right = 
      
      //you are just skipping over the data, since you are not reassigning it back to
      //what it was before  
   //} else if  (root1 != null && root2 != null) {
      
      
   } else {
      //in this case, you know that the top two casesx failed,
      //so then both of the roots are not null  
      newTree.root = new InTreeNode(3);
      root.left = trim(root1.left, root2.left);
      root.right = trim(root1.right, root2.right);
      //you might want to add something in here 
   }
   //always at the very end, you want to return the node at the end of each call
   //of the method
   return t3;
}

public List<Integer> inOrderList() {
   overallRoot = inOrderList(overallRoot);
}

public List<Integer> inOrderList(IntTreeNode root) {
   List<Integer> newList = new LinkedList<Integer>();
   
   //these are the cases if which we are going to be looking at 
   
   //if we reach the final, and the most bottom case, we are going to return the list  
   if (root == null) {
      return newList;
   } else if {

//come back to this top problem later  


//17.19 evenLevels  

public void evenLevels() {
   overallRoot = evenLevels(overallRoot, 1);
}

//for these x= change(x) problems, you want to make sure that you are returning
//something back to your public method, and that your private method
//does the majority, or the bulk of the work for the problem  
public IntTreeNode evenLevels(IntTreeNode root, int n) {
   if (root == null) {
      return null;
   
   //this is the place where you are going to be removing the 
   //leaves which are at the odd levels  
   } else if (root.left == null && root.right == null && (n % 2 == 1)) {
      //you don't have to do n + 1 here, because it is a leave node  
      return evenLevels(root, n); //<--- aks if this will work, because here I am
      //just trying to skip it
      
      //or should i use this
      return null; // <--- this also makes sense, because you want the branch with
      //those conditions to be false  
   } else {
      root.left = evenLevels(root.left, n + 1);
      root.right = evenLevels(root.right, n + 1);
      
   }
   //you want to return this every time you have one call
   return root;
}


//17.20 makePerfect  

//the helper method height would help, because it would let us know when to stop  

public void makePerfect() {
   //here you will want to find the height here of the tree, and then,
   //what you will want to do, is input into the helper method,
   //so that it knows when to stop adding in new trees   
   int height  = this.IntTreeNode.height();
   overallRoot = makePerfect(overallRoot, height);
}

public IntTreeNode makePerfect(IntTreeNode root, int size) {
   if (root == null && size == 0) {
      return null; //usually you want to have a case where you return a null
      //IntTreeNode because there is no more to go in the case
   } else if (root == null && size != 0) {
      root = new IntTreeNode(0);
      root.left = makePerfect(root.left);
      root.right = makePerfect(root.right);
   } else {
      root.left = makePerfect(root.left);
      root.right = makePerfect(root.right);
   }
   return root;      
}

public void makePerfect() {
   
      
     
   



