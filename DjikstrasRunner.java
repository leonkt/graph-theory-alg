import java.util.Scanner;
public class DjikstrasRunner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("sze");
		int size = s.nextInt();
		Graph g = new Graph(size);
		for(int i = 0; i < size; i++) {
			
			g.addEdge();
		}
		System.out.print("start");
		int src = s.nextInt();
		System.out.print("end");
		int dest = s.nextInt();
		System.out.println(g.doAlgorithm(src, dest, 0));
	}
}
