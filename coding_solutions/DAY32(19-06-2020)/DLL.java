public class Main {  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    Node head, tail = null;  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
    public void reverse() {  
        Node current = head, temp = null;  
        while(current != null) {  
            temp = current.next;  
            current.next = current.previous;  
            current.previous = temp;  
            current = current.previous;  
        }  
        temp = head;  
        head = tail;  
        tail = temp;  
    }  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
    public static void main(String[] args) {  
        Main m = new Main();  
        m.addNode(10);  
        m.addNode(20);  
        m.addNode(30);  
        m.addNode(40);  
        m.addNode(50);  
        System.out.println("Original List: ");  
        m.display();  
        m.reverse();  
        System.out.println("\nReversed List: ");  
        m.display();  
    }  
}