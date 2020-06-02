 import java.util.*; 
public class Main { 
    static Node head; 
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    static public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    static boolean detectLoop(Node h) 
    { 
        HashSet<Node> s = new HashSet<Node>(); 
        while (h != null) { 
            if (s.contains(h)) 
                return true; 
            s.add(h); 
            h = h.next; 
        } 
        return false; 
    } 
    public static void main(String[] args) 
    { 
        Main llist = new Main();
        Scanner s=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the elements");
        a=s.nextInt();
        llist.push(a); 
         b=s.nextInt();
        llist.push(b);
         c=s.nextInt();
        llist.push(c); 
         d=s.nextInt();
        llist.push(d); 
        llist.head.next.next.next.next = llist.head;
        if (detectLoop(head)) 
            System.out.println("Loop found"); 
        else
            System.out.println("No Loop"); 
    } 
}