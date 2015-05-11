public class Driver{
    public static void main(String args[]){
	Tree X = new Tree();
	Node Root = X.getRoot();
	Root.insert(5);
	for(int i = 0; i< 10; i++){
	    Root.insert(i);
	}
	System.out.println(X.getRoot().toString());
    }
}
