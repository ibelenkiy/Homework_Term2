import java.util.*;
public class Driver{
    public static void main(String args[]){
	myStack<int> Stack = new myStack;
	System.out.println(Stack.empty());
	Stack.push(5);
	System.out.println(Stack.top());
	Stack.push(10);
	System.out.println(Stack.top());
	Stack.pop();
	System.out.println(Stack.top());
    }
}
