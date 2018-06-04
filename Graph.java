import java.util.*;
public class Graph {
	int[][] weights;
	TreeSet<Integer> visited = new TreeSet<Integer>();
	public Graph(int size) {
		weights = new int[size][size];
		for(int i = 0; i < weights.length; i++) {
			for(int j = 0; j < weights[0].length; j++) {
				if(i == j) {
					weights[i][j] = 0;
				}
			}
		}
	}
	
	public int doAlgorithm(int start, int finish, int total) {
		if(start == finish) {
			return total;
		}
		int currNode = start;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < weights.length; i++) {
			if((!visited.contains(i) && weights[start][i] != 0 ) && weights[start][i] < min) {
				min = weights[start][i];
				currNode = i;
			}
		}
		visited.add(start);
		return this.doAlgorithm(currNode, finish, total + min);
	}
	
	public void addEdge() {
		Scanner s = new Scanner(System.in);
		System.out.print("src");
		int start = s.nextInt();
		System.out.print("des");
		int finish = s.nextInt();
		System.out.print("wei");
		int weight = s.nextInt();
		this.weights[start][finish] = weight;
		this.weights[finish][start] = weight;
	}
}