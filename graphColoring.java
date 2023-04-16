

import java.util.*;
import java.util.LinkedList;
public class graphColoring {

	private int V; 
	private LinkedList<Integer> adj[]; 

	graphColoring(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}
	void addEdge(int v,int w)
	{
		adj[v].add(w);
		adj[w].add(v); 
	}
	void greedyColoring()
	{
		int result[] = new int[V];
		Arrays.fill(result, -1);
		result[0] = 0;
		boolean available[] = new boolean[V];
		

		Arrays.fill(available, true);

		// Assign colors to remaining V-1 vertices
		for (int u = 1; u < V; u++)
		{
			// Process all adjacent vertices and flag their colors
			// as unavailable
			Iterator<Integer> it = adj[u].iterator() ;
			while (it.hasNext())
			{
				int i = it.next();
				if (result[i] != -1)
					available[result[i]] = false;
			}

			// Find the first available color
			int cr;
			for (cr = 0; cr < V; cr++){
				if (available[cr])
					break;
			}

			result[u] = cr; // Assign the found color

			// Reset the values back to true for the next iteration
			Arrays.fill(available, true);
		}

		// print the result
		for (int u = 0; u < V; u++)
			System.out.println("Vertex " + u + " ---> Color "
								+ result[u]);
	}

	public static void main(String args[])
	{
		graphColoring g1 = new graphColoring(5);
		g1.addEdge(0, 1);
		g1.addEdge(0, 2);
		g1.addEdge(1, 2);
		g1.addEdge(1, 3);
		g1.addEdge(2, 3);
		g1.addEdge(3, 4);
		System.out.println("Coloring of graphColoring 1");
		g1.greedyColoring();

		System.out.println();
		graphColoring g2 = new graphColoring(5);
		g2.addEdge(0, 1);
		g2.addEdge(0, 2);
		g2.addEdge(1, 2);
		g2.addEdge(1, 4);
		g2.addEdge(2, 4);
		g2.addEdge(4, 3);
		System.out.println("Coloring of graphColoring 2 ");
		g2.greedyColoring();
	}
}
