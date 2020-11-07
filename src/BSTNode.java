public class BSTNode {
  // class variables
  BSTNode left;
  BSTNode right;
  int value;
  
  BSTNode(int inVal){
    value = inVal;
  }

   
  public boolean find(int inValue) {
    if(inValue == value) {
      return true;
    }
    
    if(left != null && inValue < value) {
      return left.find(inValue);
    }else if(right != null && inValue > value){
      return right.find(inValue);
    }
    return false;
  }
  
  
  // Inserts a given integer into a given binary search tree.
  void insert(int inValue){
  }

  // Removes a given integer from a tree (assuming it exists).
  void remove(int inValue){
  }
  
  // Removes the node that is labeled with the minimum odd number contained in the tree. 
  // If no odd numbers are in the tree, do nothing.
  void removeMinOdd(){
  }
  
  // Removes the node that is labeled with the minimum even number contained in the tree. 
  // If no even numbers are in the tree, do nothing.
  void removeMinEven(){
  }
  
  // Removes the node that is labeled with the maximum odd number contained in the tree. 
  // If no odd numbers are in the tree, do nothing.
  void removeMaxOdd(){
  }
  
  // Removes the node that is labeled with the maximum even number contained in the tree. 
  // If no even numbers are in the tree, do nothing.
  void removeMaxEven(){
  }

  // Searches the tree to find the (pointer to) the node with the minimum value in the subtree.
  BSTNode findMin(){
    return null;
  }
  
  // Searches the tree to find the (pointer to) the node with the minimum odd value in the subtree. 
  // If no odd numbers are in the tree, return null.
  BSTNode findMinOdd(){
    return null;
  }
  
  // Searches the tree to find the (pointer to) the node with the minimum even value in the subtree.
  // If no even numbers are in the tree, return null.
  BSTNode findMinEven(){
    return null;
  }
  
  // Searches the tree to find the (pointer to) the node with the maximum odd value in the subtree. 
  // If no odd numbers are in the tree, return null.
  BSTNode findMaxOdd(){
    return null;
  }
  
  // Searches the tree to find the (pointer to) the node with the maximum even value in the subtree. 
  // If no even numbers are in the tree, return null.
  BSTNode findMaxEven(){
    return null;
  }
  
  // Counts the number of nodes in the (sub)tree that are labeled with an odd number.
  int countOdd(){
    return 0;
  }
  
  // Counts the number of nodes in the (sub)tree that are labeled with an even number.
  int countEven(){
    return 0;
  }
  
  public String toString() {
    return String.valueOf(value);
  }
 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + this);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    else if(right != null) System.out.println(prefix + "\u251C " + "\u2400");
    if(right != null) right.print(prefix + "\u2514 ");
    else if(left != null) System.out.println(prefix + "\u2514 " + "\u2400");
  }
}
