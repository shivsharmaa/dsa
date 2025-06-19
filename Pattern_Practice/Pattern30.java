package demo;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row=1, nst=0;
		
		while(row<=n) {
			
			
			int count=n;
			
			while(count>nst) {
				System.out.print(count+" ");
				count--;
			}
			
			System.out.println();
		
			row++;
			
		}
	}

}
