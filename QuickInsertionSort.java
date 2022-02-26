import java.util.Scanner;

public class QuickInsertionSort {
    int[] Heap;
    int size;
    int maxsize;
    public QuickInsertionSort(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }
     int parent(int position) {
    	 return (position - 1) / 2; 
    	 }
     
    int leftChild(int position) {
    	return (2 * position); 
    	}
    
   int rightChild(int position)
    {
        return (2 * position) + 1;
    }
    boolean isLeaf(int position)
    {
        if (position > (size / 2) && position <= size) {
            return true;
        }
        return false;
    }
     void swap(int first, int last)
    {
        int tmp;
        tmp = Heap[first];
        Heap[first] = Heap[last];
        Heap[last] = tmp;
    }
     void maxHeap(int position)
    {
        if (isLeaf(position))
            return;
 
        if (Heap[position] < Heap[leftChild(position)] || Heap[position] < Heap[rightChild(position)]) {
 
            if (Heap[leftChild(position)]> Heap[rightChild(position)]) {
                swap(position, leftChild(position));
                maxHeap(leftChild(position));
            }
            else {
                swap(position, rightChild(position));
                maxHeap(rightChild(position));
            }
        }
    }
    public void insert(int element)
    {
        Heap[size] = element;
        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }
    public void print()
    {
       
      for(int i=0;i<size;i++){
            if(leftChild(i)<size)
               System.out.print(Heap[leftChild(i)]+" ");
             
            if(rightChild(i)<size) 
                System.out.print(Heap[rightChild(i)]+" ");
        }
           
    }
    public static void main(String[] arg)
    {
    	Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for(int j=0;j<n;j++) {
			int x = scan.nextInt();
			QuickInsertionSort Qs= new QuickInsertionSort(x);
		for(int i=0;i<x;i++) {
			int c = scan.nextInt();
			Qs.insert(c);
		
		}
		Qs.print();
		}
		

    }
}