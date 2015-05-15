public class myStack<E>{
    // You decide how the node(s) are declared
    private Node Top = null;
    // make whatever constructor(s) you need
    public myStack(){
	Top = null;
    }
    public void push(E data){
        // add something to the top
	Node<E> n = new Node(data);
	n.setNext(Top);
	Top = n;
    }

    public E pop(){
        // remove and return the top item from the stack
	Top = Top.getNext();
	return Top;
    }

    public boolean empty(){
	return  Top == null;
	}
    }

    public E top() {
        // return the top item from the stack
	return Top.getData();
    }
}
