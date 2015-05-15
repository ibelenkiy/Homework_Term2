import java.util.*;
public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	l.tailAdd("hello");
	//	l.add(1,"world");
	for (int i=0;i<5;i++){
	    l.tailAdd(""+i);
	}
	System.out.println(l);
	System.out.println(l);
    }
}
