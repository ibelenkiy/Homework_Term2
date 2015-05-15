public class LList{
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }
		
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public String get(int n){
	Node tmp= l;
	int i=0;	
	while(i<n){    
	    tmp = tmp.getNext();
	    i++;	
	}
	return tmp.getData();
    }
    public void add(int n, String s){
	Node tmp = new Node(s);
	Node tmp2= l;
	int i=0;	
	while(i<n){    
	    tmp = tmp.getNext();
	    i++;	
	}
	tmp.setNext(tmp2.getNext());
	tmp2.setNext(tmp);
    }
    public void addBeginning(String s){
	Node tmp= new Node(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
    }
}
