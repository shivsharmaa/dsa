package demo;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1;
		int col=1;
		int nst=n;
		int nsp = n-1;
		
		while(row<=n) {
			int csp = 0;
			while(col<nsp) {
				if(row==1 || row==n || col==1 || col==5) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
				
				col++;
			}
			System.out.println();
			row++;
			col++;
		}
	}

}
