import java.util.*;
public class KColoring {
	 int numberofvertices;   
	 LinkedList<Integer> adjacencyList[]; 
	 
	    
	    KColoring(int v)
	    {
	        numberofvertices = v;
	        adjacencyList = new LinkedList[v];
	        for (int i=0; i<v; ++i)
	            adjacencyList[i] = new LinkedList();
	    }
	    void addEdge(int v,int w)
	    {
	        adjacencyList[v].add(w);
	        adjacencyList[w].add(v); 
	    }
	    void Coloring() {
	    	int result[]= new int[numberofvertices];
	    	for(int i=1;i<result.length;i++) 
	    		result[i]=Integer.MIN_VALUE;
	    	boolean[] visited= new boolean[numberofvertices];
	    	for(int i=0;i<visited.length;i++) 
	    		visited[i]=true;
	    	for(int i=1;i<numberofvertices;i++) {
	    		Iterator<Integer> Iterate= adjacencyList[i].iterator();
	    		while(Iterate.hasNext()) {
	    			int c= Iterate.next();
	    			if(result[i]!=-1)
	    				visited[result[i]]=false;
	    		}
	    		int SafeKeeping;
	    		for(SafeKeeping=0;SafeKeeping<numberofvertices;SafeKeeping++) 
	    			if(visited[SafeKeeping])break;
	    		result[i]=SafeKeeping;
	    		Arrays.fill(visited, true);
	    		
	    	}
	    }
	    public static void main(String args[]) {
	    	Scanner scan = new Scanner(System.in);
	    	int sizeofGraph= scan.nextInt();
	    	
	    }
}