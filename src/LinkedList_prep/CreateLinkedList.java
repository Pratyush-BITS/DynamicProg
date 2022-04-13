package LinkedList_prep;

import java.util.NoSuchElementException;
import java.util.Stack;

class Linked_List{

    private Node head = null;

    static class Node {
        private int data;
        private Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode =null;
        }
    }

    void insert(int data){

        if(head == null)
            head = new Node(data);

        else {
            Node temp = head;
            while (temp.nextNode != null)
                temp = temp.nextNode;
            temp.nextNode = new Node(data);
        }
    }


    void printList(){
        if(head == null)
            System.out.println("List is empty");
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.nextNode;
            }
        }
        System.out.println();
    }

    int get(int index){

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.nextNode;
            if(temp == null)
                throw new IndexOutOfBoundsException("Index out of bounds ");
        }
        return temp.data;
    }

    void update(int index, int data){

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.nextNode;
            if(temp == null)
                throw new IndexOutOfBoundsException("Index is out of bounds ");
        }
        temp.data = data;
    }

    int FindMiddle(){
        if(head!=null){
            Node curr =head, next = curr;
            while (next!=null && next.nextNode!=null){
                    next = next.nextNode.nextNode;
                    curr = curr.nextNode;
            }
            return curr.data;
        }
        throw new NoSuchElementException("No such element found");
    }

    int FindKthNodeFromEnd(int k){

        if(k<0)
            throw new NullPointerException("Negative Index Exception");

        Node temp = head, kthValueFromEnd = head;
        for (int i = 0; i <= k; i++) {
            if(temp == null)
                throw new NullPointerException("Index Out of Bounds");
            temp = temp.nextNode;
        }
        while (temp!=null){
            temp= temp.nextNode;
            kthValueFromEnd = kthValueFromEnd.nextNode;
        }
        return kthValueFromEnd.data;
    }

    void reversePrint() {

        Stack<Integer> stack = new Stack<>();
        Node tempNode = head;
        while(tempNode!=null) {
            stack.push(tempNode.data);
            tempNode = tempNode.nextNode;
        }
        while(!stack.empty())
            System.out.print(stack.pop()+" ");
        System.out.println();
    }

    void reverse(){
        if ( head != null) {
            Node curr =head, next = curr.nextNode, prev = head;
            prev.nextNode =null;
            while (next != null){
                curr = next;
                next = next.nextNode;
                curr.nextNode = prev;
                prev = curr;
            }
            head = curr;
        }
    }

    Node removeContinuousDuplicates() {

        Node temp = head, temp1=head.nextNode;
        while(temp1!=null){
            while(temp1!=null && temp.data==temp1.data){
                temp.nextNode = temp1.nextNode;
                temp1 = temp1.nextNode;
            }
            temp = temp.nextNode;
        }
        return head;
    }

}

public class CreateLinkedList {

    public static void main(String[] args) {

        try {

            //Creating a LinkedList using parameter less constructor
            Linked_List list = new Linked_List();

            //Declaring variable for all the loops
            int j = 10;

            //adding values to the list -> we'll call this Original List
            for (int i = 0; i < j; i++)
                list.insert(i);

            //Printing all the elements of the list
            list.printList();

            //accessing each element using get function
            for (int i = 0; i < j; i++)
                System.out.print(list.get(i) + " ");
            System.out.println();

            //Updating list using update function
            for (int i = 0; i < j; i++)
                list.update(i, i + 10);

            //accessing each element using get function
            for (int i = 0; i < j; i++)
                System.out.print(list.get(i) + " ");
            System.out.println();

            //Reversing the list
            list.reverse();
            for (int i = 0; i < j; i++)
                System.out.print(list.get(i) + " ");
            System.out.println();

            //Reversing it and updating to make it the original list
            list.reverse();
            for (int i = 0; i < j; i++)
                list.update(i, list.get(i) - 10);

            //Printing the list in reverse order
            list.reversePrint();

            //Finding the middle element in the linked list, you can chage the value of j to understand this
            System.out.println("Middle element = "+list.FindMiddle());
            //Finding value present at kth node from the end
            System.out.println("0th node from the end "+list.FindKthNodeFromEnd(0));
            //Index points to null
            System.out.println("Kth node from the end "+list.FindKthNodeFromEnd(-1));
            //for  j = 10 -> out of bounds
            //System.out.println("Kth node from the end "+list.FindKthNodeFromEnd(11));
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}