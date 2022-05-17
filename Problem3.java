import java.util.*;

public class Problem3 {
	int printBestOccurance(char[] Numbers, int start, int finish) {
		
		
		int count=0;
		for(int i=start;i<finish;i++) {
			if(Numbers[i]==Numbers[i-1])
				count++;
		}
		return count;
	}
	
	public static void main(String args[]) {
		Problem3 P= new Problem3();
		
		Scanner scan = new Scanner(System.in);
		String input=scan.nextLine();
		if(input.length()<=1)
			System.out.println(0);
		if(input.length()==2) {
			if(input.charAt(0)==input.charAt(1))
				System.out.println(1);
			
		}
		else{	
		char[] Numbers=input.toCharArray();
		
		int testcases=scan.nextInt();
		
		for(int i=0;i<testcases;i++) {
			int area1=scan.nextInt();
			int area2=scan.nextInt();
			System.out.println(P.printBestOccurance(Numbers, area1, area2));
		}
		}
	}
	
}