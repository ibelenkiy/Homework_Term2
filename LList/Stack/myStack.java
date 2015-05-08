public class myStack<E>{
    // You decide how the node(s) are declared
    private Node<E> Top;
    // make whatever constructor(s) you need

    public void push(E data){
        // add something to the top
	Node<E> n = new Node<E>(data);
	n.setNext(Top);
	Top = n;
    }

    public E pop(){
        // remove and return the top item from the stack
	E tmp = Top.getData();
	if(empty()){
	    return null;
	}else{
	    Top = Top.getNext();
	}
	return tmp;
    }

    public boolean empty(){
	return Top == null;
    }

    public E top() {
        // return the top item from the stack
	return Top.getData();
    }
}
