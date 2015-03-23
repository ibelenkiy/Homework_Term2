public class Node<E>{
		private String data;
		private Node<E> next;

		public Node<E>(String s){
				data = s;
				next = null;
		}
		public void setData(String s){
				data = s;
		}
		public String getData(){
				return data;
		}
		public void setNext(Node n){
				next = n;
		}
		public Node getNext(){
				return next;
		}
		public String toString(){
				return data;
		}
}
