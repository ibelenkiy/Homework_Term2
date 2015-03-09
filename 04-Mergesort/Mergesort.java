import java.util.*;
public class Mergesort{
    ArrayList<Integer> Al = new ArrayList<Integer>();
    public ArrayList<Integer> Merge(ArrayList<Integer> A, ArrayList<Integer> B){
	ArrayList<Integer> Merged = new ArrayList<Integer>(A.size());
	if (A.size() == 0){
	    return Merged.add(B);
	}
	if (B.size() == 0){
	    return Merged.add(A);
	}else{
	    if(A.get(0)>B.get(0)){
		Merged= Merged.add(A.get(0));
		A = A.remove(0);
		Merge(A, B);
	    }else{
		Merge(B, A);
	    }
	}

/*	if(Al.size() <= 1){
	return Al;
	}else{
	    for(i=0; while i)
*/
}
}
