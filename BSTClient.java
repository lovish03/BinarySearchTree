import java.util.*;
class BSTClient
{
  public static void main(String[] args)
  {
      BinarySearchTree<Integer, Integer> tree = new BinarySearchTree<Integer, Integer>();
      tree.put(7,11);
      tree.put(9,8);
      tree.put(5,99);
      tree.put(3,51);
      tree.put(6,7);
      tree.put(8,3);
      tree.put(10,33);
      System.out.print("Inorder Traversal:   ");
      tree.inOrder(tree.getRoot());
      System.out.println();
      System.out.print("LevelOrder Traversal:   ");
      tree.levelOrder(tree.getRoot());
      System.out.println();
  }
}
 
