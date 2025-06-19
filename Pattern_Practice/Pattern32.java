package demo;

import java.util.Scanner;

public class Pattern32{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row=1, nst=1, nsp=n-1;
		
		while(row<=n) {
			int csp=0;
			
			while(csp<nsp) { 
				System.out.print("");
				
				
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				if(cst%2==0 ) {
					System.out.print("* ");
				}else {
					
					System.out.print(row+" ");
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
