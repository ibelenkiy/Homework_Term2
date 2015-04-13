import java.util.*;

public class Frontier{
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	l.add(n);
    }
    public node remove(){
	return l.remove();
    }
    public boolean isEmpty(){
	return l.isEmpty();
    }
}
