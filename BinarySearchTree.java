import java.util.*;
class BinarySearchTree<Key extends Comparable<Key>, Value> 
{

  private Node root;
  
    private class Node
    {
      Key key;
      Value value;
      Node left;
      Node right;
      int size = 0;
      public Node(Key key, Value value, int size)
      {
        this.key=key;
        this.value=value;
        this.size=size;
      }
    }

    public void put(Key key, Value value)
    {
      root = put(root,key,value);
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return x.size;
    }

    private  Node put(Node x, Key key, Value value)
    {
       if(x==null)
        return new Node(key,value,1);
      int cmp=key.compareTo(x.key);
      if(cmp<0)
        x.left=put(x.left,key,value);
      else if(cmp>0)
        x.right=put(x.right,key,value);
      else x.value=value;

      x.size = 1 + size(x.left) + size(x.right);
      return x;
    }

    public Node getRoot()
    {
        return root;
    }

    public void inOrder(Node x)
    {
       if(x != null)
       {
         inOrder(x.left);
         System.out.print(x.key+" ");
         inOrder(x.right);
       }
    }

 public void levelOrder(Node x)
    {
       Queue<Node> queue = new LinkedList<Node>();
         if(x != null)
         {
           queue.add(x);
         }
         while(!(queue.isEmpty()))
         {
               Node tempNode = queue.poll();
            System.out.print(tempNode.key + " ");
 
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
 
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
         }
    }

  }
 
