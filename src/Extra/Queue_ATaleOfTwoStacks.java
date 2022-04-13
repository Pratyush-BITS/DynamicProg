package Extra;

import java.util.*;

class MyQueue<T>{

    Stack<T> FIFO =new Stack<>();
    Stack<T> LIFO =new Stack<>();

    protected void enqueue(T data){
        FIFO.add(data);
    }

    protected void dequeue(){
        Transfer();
        LIFO.pop();
    }

    protected T peek(){
        Transfer();
        return LIFO.peek();
    }

    protected void Transfer(){
        if(LIFO.empty())
            while (!FIFO.empty())
                LIFO.push(FIFO.pop());
    }

//    Queue<T> queue = new LinkedList<T>();
//
//    protected void enqueue(T data){
//        queue.add(data);
//    }
//
//    protected void dequeue(){
//        queue.remove();
//    }
//
//    protected T peek(){
//        return queue.peek();
//    }

}


public class Queue_ATaleOfTwoStacks {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
