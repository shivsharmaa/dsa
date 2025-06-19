package demo;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row=1, nst=1, nsp=n-1;
		
		while(row<=n) {
			
			int csp=0;
			
			while(csp<nsp) { 
				System.out.print("  ");
				
				
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				if(cst==1 || cst == nst ) {
					System.out.print(row+" ");
				}else {
					
					System.out.print("0 ");
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
