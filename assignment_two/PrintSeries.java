package assignment_two;

import java.util.Scanner;

public class PrintSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		
		int n=1, val=0,  i=1;
		
		while(i<=N1) {
			val = 3*n+2;
			
			if(val%N2!=0) {				
				System.out.println(val);
				i++;
			}
		
			n++;
			
		}
	}
}


