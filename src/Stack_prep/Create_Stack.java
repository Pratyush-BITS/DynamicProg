package Stack_prep;

class Stack_trial{

    private int data;
    private Stack_trial below;
    private Stack_trial top = null;

    Stack_trial(){}

    Stack_trial(int data){
        this.data = data;
    }

    void push(int data){
        Stack_trial temp;
        temp = new Stack_trial(data);
        temp.below = top;
        top = temp;
    }

    void pop(){
        if(top!=null)
            top = top.below;
        else
            throw new NullPointerException("Null pointer exception");
    }

    int peek(){
        if(top!=null)
            return top.data;
        throw new NullPointerException("Null pointer exception");
    }

    int poll(){
        int a = peek();
        pop();
        return a;
    }

    void printStack(){
        Stack_trial temp = top;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.below;
        }
        System.out.println();
    }
}

public class Create_Stack {

    public static void main(String[] args) {

        try {
            Stack_trial stack = new Stack_trial();
            int j = 10;
            for (int i = 1; i < j; i++)
                stack.push(i);
            stack.printStack();
            stack.pop();
            stack.printStack();
            System.out.println(stack.poll());
            stack.printStack();
            System.out.println(stack.peek());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}