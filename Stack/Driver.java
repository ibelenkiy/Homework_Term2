import java.util.*;
public class Driver{
    public static void main(String args[]){
	myStack<String> Stack = new myStack<String>();
	System.out.println(Stack.empty());
	Stack.push("Hey");
	System.out.println(Stack.top());
	Stack.push("Hello");
	System.out.println(Stack.empty());
	System.out.println(Stack.top());
	Stack.pop();
	System.out.println(Stack.top());
    }
}
