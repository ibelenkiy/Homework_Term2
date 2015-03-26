public class myQueue<E>{
    // You decide how the node(s) are declared
    private Node<E> Back = null;
    private int Length = 0;
    // make whatever constructor(s) you need

    
    public void enqueue(E data){
        // add something to the tail/last
	Node<E> tmp = new Node<E>(data);
	if( Length == 0){
	    Back.setNext(tmp);
	}else{

	    tmp.setNext(Back.getNext());
	    Back.setNext(tmp);
	}
	Length++;
    }

    public E dequeue(){
        // remove and return the head/front item from the stack
	Node<E> tmp = Back.getNext();
	E finl = null; 
	for(int i=1;i < Length; i++){
	    tmp = tmp.getNext();
	    if( i == (Length - 1)){
		finl = tmp.getNext().getData();
		tmp.setNext(null);
		Length--;
		
	    }
	}
	return finl;
    }

    public boolean empty(){
	return Length == 0;
    }

    public E head() {
	// return the first item in the queue
	Node<E> tmp = Back.getNext();
	E finl = null; 
	for(int i=1;i < Length; i++){
	    tmp = tmp.getNext();
	    if( i == (Length - 1)){
		finl = tmp.getNext().getData();
		
	    }
	
	}
	return finl;
    }
}
