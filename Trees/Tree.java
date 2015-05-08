public class Tree{
    private Node Root;
    public Tree(){
	T = null;
    }
    public void insert(int i){
	Node Pointer = new Node();
	Node Pointer1 = new Node();
	Pointer.setRight(Root); 
	Node tmp = new Node(i); 
	if (tmp == null){
	    Root = tmp;
	    return;   
	    /*	}else{
	    while(pointer.getRight() != null){
		if(tmp.getData() < Pointer.getRight().getData()){
		    if ( Pointer.getRight().getLeft().getData() == null){
		    Pointer.getRight().setLeft(tmp);
		    return;
		    }else{
			Pointer = setRight(Pointer.getRight().getLeft());
		}
		if(tmp.getData() > Pointer.getRight().getData()){
		    if ( Pointer.getRight().getRight().getData() == null){
		    Pointer.getRight().setRight(tmp);
		    return;
		    }else{
			Pointer = setRight(Pointer.getRight().getLeft());
		    }
		}
		}
	    }
	}
    }
	 
}
    public Node Search(Node t, int i){
    }
}
	    */
