import java.util.*;
class Graph
{
	 int numberofvertices;
	 LinkedList<Integer> adj[];
	Graph(int v)
	{
		numberofvertices = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}
	void addEdge(int v, int w)
	{
		adj[v].add(w);
		adj[w].add(v); 
	}
	void printVertexCover()
	{
		boolean visited[] = new boolean[numberofvertices];
		for (int i=0; i<numberofvertices; i++)
			visited[i] = false;

		
		for (int u=0; u<numberofvertices; u++)
		{
			if (visited[u] == false)
			{
				Iterator<Integer> i = adj[u].iterator();
				while (i.hasNext())
				{
					int v = i.next();
					if (visited[v] == false)
					{
						visited[v] = true;
						visited[u] = true;
						break;
					}
				}
			}
		}
		for (int j=0; j<numberofvertices; j++)
			if (visited[j])
			System.out.print(j+" ");
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int numberofVertices=scan.nextInt();
		Graph g = new Graph(numberofVertices);
		

		g.printVertexCover();
	}
}
