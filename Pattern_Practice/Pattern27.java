package demo;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row=1, nst=1, nsp=n-1;
		
		while(row<=n) {
			int val=1;
			int csp=1;
			
			while(csp<=nsp) { 
				System.out.print("  ");
				
				
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print(val+" ");
				if(cst<=nst/2) {
					val++;
				}else {
					
					val--;
				}
				cst++;

			}
			
			System.out.println();
			nsp--;
			row++;
			nst+=2;
		}
	}

}
