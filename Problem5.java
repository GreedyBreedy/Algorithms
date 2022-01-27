import java.util.*;
public class Problem5{
	 Node root;
		    class Node
		    {
		        int K;
		        Node l, r;
				
		        public Node(int item)
		        {
		            K = item;
		            l = r = null;
		        }
		    }
		    
		    {
		         root = null;
		    }
		    void insert(int key)
		    {
		         root = insertWithComparative(root, key);
		    }
		    Node insertWithComparative(Node root, int key)
		    {
		        if (root == null)
		        {
		            root = new Node(key);
		            return root;
		        }
		        if (key < root.K)
		            root.l = insertWithComparative(root.l, key);
		        else if (key > root.K)
		            root.r = insertWithComparative(root.r, key);
		        return root;
		    }
		  
void BFS() {
	Queue<Node>Q= new LinkedList<Node>();
	Q.add(root);
	while(!Q.isEmpty()) {
		Node y = Q.poll();
		System.out.println(y.K);
		if(y.l!=null)
			Q.add(y.l);
		if(y.r!=null)
			Q.add(y.r);
	}
}
public static void main(String args[]) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the number of nodes:");
	int sizeofQueue=scan.nextInt();
Problem5 tree= new Problem5();
	for(int i=0;i<sizeofQueue;i++) {
		int x = scan.nextInt();
		tree.insert(x);
	}
	System.out.println("Result:");
	Problem5 BFS = new Problem5();
	tree.BFS();
}

}
