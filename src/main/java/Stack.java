package src.main.java;

public class Stack {
    Node top;

    static class Node{
        int data;
        Node next;

     public Node(int value){
        data = value;
        next = null;
     }
    }

    public Stack()
    {
        top = null;
    }
    public void push(int item)
    {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public int pop()
    {
        if (top != null){
        int value = top.data;
        top = top.next;
        return value;
        }
        else
        {return -1;}
    }

    public void display() 
    {
        Node current = top;
        while (current != null)
        {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(5);
        myStack.push(4);
        myStack.display();
        myStack.pop();
        System.out.println(myStack.pop());
        myStack.display();
    }
}
