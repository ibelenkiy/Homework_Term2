public class myStack<E>{
    // You decide how the node(s) are declared
    private Node Top;
    // make whatever constructor(s) you need

    public void push(E data){
        // add something to the top
	Node<E> n = new Node<E>(data);
	n.setNext(Top);
	Top = n;
    }

    public E pop(){
        // remove and return the top item from the stack
	Top = Top.getNext();
	return Top;
    }

    public boolean empty(){

    }

    public E top() {
        // return the top item from the stack

    }
}
