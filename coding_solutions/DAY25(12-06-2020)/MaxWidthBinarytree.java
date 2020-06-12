import java.util.LinkedList;  
import java.util.Queue;  
public class Main {  
      public static class Node{  
        int data;  
        Node left;  
        Node right;  
        public Node(int data){  
          this.data = data;  
          this.left = null;  
          this.right = null;  
        }  
      }  
      public Node root;  
      public Main(){  
        root = null;  
      }  
      public int findMaximumWidth() {  
          int maxWidth = 0;  
          int nodesInLevel = 0;  
          Queue<Node> queue = new LinkedList<Node>();  
          if(root == null) {  
              System.out.println("Tree is empty");  
              return 0;  
          }  
          else {  
              queue.add(root);  
              while(queue.size() != 0) {  
                  nodesInLevel = queue.size();  
                  maxWidth = Math.max(maxWidth, nodesInLevel);  
                  while(nodesInLevel > 0) {  
                     Node current = queue.remove();  
                     if(current.left != null)   
                         queue.add(current.left);  
                     if(current.right != null)   
                         queue.add(current.right);  
                     nodesInLevel--;  
                  }  
              }  
          }  
          return maxWidth;  
      }  
      public static void main(String[] args) {  
          Main m = new Main();  
          m.root = new Node(1);  
          m.root.left = new Node(2);  
          m.root.right = new Node(3);  
          m.root.left.left = new Node(4);  
          m.root.left.right = new Node(5);  
          m.root.right.left = new Node(6);  
          m.root.right.right = new Node(7);  
          m.root.left.left.left = new Node(8);  
          System.out.println("Maximum width of the binary tree: " + m.findMaximumWidth());  
      }  
}