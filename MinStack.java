import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(2);
        obj.push(3);
        obj.push(-2);
        obj.push(4);
        System.out.println("Top: " + obj.top());
        System.out.println("Min: " + obj.getMin());
    }

    public void push(int x) {
        if(this.minStack.isEmpty() || this.minStack.peek()>x)
            this.minStack.push(x);
        this.stack.push(x);
    }

    public void pop(){
        int x = this.stack.pop();
        if(this.minStack.peek() == x)
            this.minStack.pop();
    }

    public int top(){
        return this.stack.peek();
    }

    public int getMin(){
        return this.minStack.peek();
    }
}