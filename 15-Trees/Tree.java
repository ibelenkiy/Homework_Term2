public class Tree{
    private Node Root;
    public Tree(){
	Root = null;
    }
    public Node getRoot(){
	return Root;
    }
    public void insert(Node t,int i){
	if(t == null){
	   t = new Node(i);
	}else{
	    if(t.getData() == i){
	    }else{
		if(i> t.getData()){
		    insert(t.getRight(), i);
			}
		else{
		    insert(t.getLeft(), i);
		}
	    }
	}
    }
}
