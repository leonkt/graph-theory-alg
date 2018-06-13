/**
 @Author:
 Period:
 Date Started: May 23, 2018
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class BellmanFord 
{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("vertices #");
		int vertices = s.nextInt();
		System.out.println("edges #");
		int edges = s.nextInt();
		Graph g = new Graph(vertices, edges);
		for(int i = 0; i < edges; i++){ //this loop goes through the 2d array and adds edges with given weights
			System.out.println("a to add");
			String c = s.next();
			if(c .equals("a")){
				System.out.println("from");
				int v1 = s.nextInt();
				g.edgy[i].source = v1;
				System.out.println("to");
				int v2 = s.nextInt();
				g.edgy[i].dest = v2;
				System.out.println("weight");
				int w = s.nextInt();
				g.edgy[i].weight = w;
			}
			else{
				break;
			}
		}
		System.out.println("where to begin?");
		int begin = s.nextInt();
		g.performBellmanFord(g, begin);
		
	}


	
}



