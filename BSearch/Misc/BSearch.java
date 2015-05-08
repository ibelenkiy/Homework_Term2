import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='I';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Maze() 
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
				
    }
		
    public String toString()
    {
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++){
		    s = s +board[x][y];
		    s=s+"\n";
		}
	    }
	return s;
    }
    // THE SOLVE
    private myQueue<Integer> Queue;
    public void bfs(int x,int y){
	Frontier f = new Frontier();
	f.add(new Node(x,y));

	Node temp = null;
	int tx = 0,ty = 0;
	while(f.isEmpty()){
	    Node current = f.remove();
	    int cx = current.getX();
	    int cy = current.getY();
	    board [cx][cy]= 'I';
	
}
    }
}
