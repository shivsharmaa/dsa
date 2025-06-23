package demo;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row = 1, nst1=1, nst2=1, nsp1=n-1, nsp2=-1;
		
		int count = 1;
		while(row<=n) {
			int val=count;
			int csp1=1;
			while(csp1<=nsp1) {
				System.out.print("  ");
				csp1++;
			}
			int cst1=1;
			while(cst1<=nst1) {
				System.out.print(val+" ");
				
				cst1++;
				val--;
			}
			int csp2=1;
			while(csp2<=nsp2) {
				System.out.print("  ");
				csp2++;
			}
			int cst2=1;
			if(row==1 || row==n) {
				cst2++;
			}
			while(cst2<=nst2) {
				System.out.print(cst2+" ");
			cst2++;
			}
			System.out.println();
			if(row<=n/2) {
				count++;
				nst1++;
				nst2++;				
				nsp1-=2;
				nsp2+=2;
				
			}else {
				count--;
				nst1--;
				nst2--;
				nsp1+=2;
				nsp2-=2;
			}
			
			row++;
		}
	}
}
