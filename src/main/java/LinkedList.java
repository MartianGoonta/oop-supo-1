package src.main.java;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

     public Node(int value){
        data = value;
        next = null;
     }
    }

    public LinkedList()
    {
        head = null;
    }

    public void addItem(int newItem)
    {
        Node newNode = new Node(newItem);
        if (head == null)
        {
            head = newNode; 
        }
        else {
            Node currentNode = head;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void removeItem(int item)
    {
        Node currentNode = head;
        while (currentNode.next != null)
        {
            if (currentNode.next.data == item)
            {
                currentNode.next = currentNode.next.next;
                return;
            }
        }
    }

    public int findHead()
    {
        return head.data;
    }

    public int findN(int n)
    {
        Node currentNode = head;
        for (int i = 1; i < n; i++)
        {
            if (currentNode.next != null){
            currentNode = currentNode.next;
            }
        }
        return currentNode.data;
    }

    public int findLength()
    {
        Node currentNode = head;
        int length = 1;
        while (currentNode.next != null)
        {
            currentNode = currentNode.next;
            length += 1;
        } 
        return length;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean detectCycle()
    {
        //create new list
        if (head == null || head.next == null)
        {
            return false;
        }

        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next == null)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (fastPointer == slowPointer)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();
        myList.addItem(1);
        myList.addItem(2);
        myList.addItem(3);
        myList.addItem(5);
        myList.addItem(2);
        myList.addItem(3);
        myList.addItem(8);
        myList.addItem(1);
        myList.addItem(3);
        myList.display();
        myList.removeItem(2);
        myList.display();
        System.out.println(myList.findHead());
        System.out.println(myList.findLength());
        System.out.println(myList.findN(6));
        System.out.println(myList.detectCycle());
    }
}
