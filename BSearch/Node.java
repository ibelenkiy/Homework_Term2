public class Node<E>{
    private E data;
    private int x,y;
    private Node<E> next;
    public Node(E s){
	data = s;
	next = null;
    }
    public void  setX(int i){
	x = i;
    }
    public int getX(){
	return x;
    }
    public void  setY(int i){
	y = i;
    }
    public int getY(){
	return y;
    } 
    public void setData(E s){
	data = s;
    }
    public E getData(){
	return data;
    }
    public void setNext(Node<E> n){
	next = n;
    }
    public Node<E> getNext(){
	return next;
    }
    public String toString(){
	return "" + data;
    }
}
