import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Graph
{
    int V, E;
    Edge edgy[];
 
    // Creates a graph with V vertices and E edges
    Graph(int v, int e)
    {
        V = v;
        E = e;
        edgy = new Edge[e];
        for (int i=0; i<e; ++i)
            edgy[i] = new Edge();
    }

    void performBellmanFord(Graph graph,int src)
    {
        int V = graph.V;
        int E = graph.E;
        int dist[] = new int[V];
 
        for (int i=0; i<V; ++i) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        for (int i=1; i<V; ++i)
        {
            for (int j=0; j<E; ++j)
            {
                int u = graph.edgy[j].source;
                int v = graph.edgy[j].dest;
                int weight = graph.edgy[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
                    dist[v] = dist[u] + weight;
            }
        }

        for (int j=0; j<E; ++j)
        {
            int u = graph.edgy[j].source;
            int v = graph.edgy[j].dest;
            int weight = graph.edgy[j].weight;
            if (dist[u] != Integer.MAX_VALUE &&
                dist[u]+weight < dist[v])
              System.out.println("Graph contains negative weight cycle");
        }
        printArr(dist);
    }

    void printArr(int[] dist) {
        for(int d : dist) {
        	System.out.println("" + d);
        }
    }
}

