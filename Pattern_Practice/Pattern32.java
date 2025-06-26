package demo;

import java.util.Scanner;

public class Pattern32{
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
			int nst = 1, row = 1;
			
			int val=1;
			while(row<= 2 * n - 1) {
				int cst = 1;
				
				while(cst <= nst) {
					if(cst%2==1) {
						
						System.out.print(val+" ");
					}else {
						System.out.print("* ");
					}
				cst++;
				}
				
				System.out.println();
				if(row<n) {
					val++;
					nst+=2;
				}else {
					val--;
					nst-=2;
				}
				row++;
			}
		}
	}
