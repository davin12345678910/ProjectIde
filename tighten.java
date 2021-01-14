public void tighten() {
   overallRoot = tighten(overallRoot);
}

//reorder the code that you execture here 
//and be sure that your code handles the case where the node is null

private IntTreeNode tighten(IntTreeNode root) {
   //change this up later  
   if (root == null) {
      return null;
   }
   //you will most likely need a root == null case in these types of problems  
   if (root.left == null && root.right != null) {
      root = root.left;
   } else if (root.right == null && root.left != null) {
      root = root.right; 
   } else {
      //this will allow you to increment through the data  
      root.left = tighten(root.left);
      root.right = tighten(root.right);
   }    
      
   //you want to remove cases where there are one child
   //and you want to not remove annything if they are btih null
   return root;
}


//root = root.next.next <--- something like this 