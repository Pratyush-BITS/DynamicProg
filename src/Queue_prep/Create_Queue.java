package Queue_prep;

class Queue_trial{

    Queue_trial top = null;
    Queue_trial end = null;
    int data;

    Queue_trial(){}

    Queue_trial(int data){
        this.data = data;
    }

    void push(int data){
        Queue_trial temp = new Queue_trial(data);
        if(end == null)
            top = end = temp;
        else {
            temp.end = top;
            top = temp;
        }

    }

    void pop(){
        if(top!=null)
            top = top.end;
    }

    void printQueue(){
        Queue_trial temp = top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.end;
        }
        System.out.println();
    }

}

public class Create_Queue {

    public static void main(String[] args) {

        Queue_trial queue =new Queue_trial();

        int j = 10;
        for (int i = 1; i < j; i++)
            queue.push(i);
        queue.printQueue();
        queue.pop();
        queue.printQueue();
    }
}
