package LinkedList_prep;

class DllCreate{

    private DoublyLinkedListNode head = null;

    static class DoublyLinkedListNode {
        private int data;
        private DoublyLinkedListNode next;
        private DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    void insert(int data){



    }

    void printDLL(){
        DoublyLinkedListNode temp = head;
        while (temp!=null)
            System.out.print(temp.data+" ");
    }

}

public class DLL {

    public static void main(String[] args) {

        DllCreate dll =new DllCreate();

    }

}
