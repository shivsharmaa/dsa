package demo;

import java.util.Scanner;

public class PatternInvertedHourGlass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row = 1, nst1=1, nst2=1, nsp=2*n - 1;
		
		int count=n;
		int count1=n;
		while(row<=2*n+1) {
			int val=count;
			int val2=count1;
			int cst1=1;
			while(cst1<=nst1) {
				System.out.print(val+" ");
				cst1++;
				val--;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
			csp++;
			}
			int cst2=1;
			if(row==n+1) {
				cst2++;
				val2++;
			}
			
			while(cst2<=nst2) {
				System.out.print(val2+" ");
				val2++;
				cst2++;
			}
			System.out.println();
			
			if(row<=n) {
				nst2++;
				nsp-=2;
				nst1++;
				count1--;
			}
			else {
				count1++;
				nst2--;
				nsp+=2;
				nst1--;
			}
			row++;
		}
	}
}
