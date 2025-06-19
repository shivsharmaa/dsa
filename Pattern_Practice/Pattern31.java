package demo;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row=1, nst=1;
		
		while(row<=n) {
			int count=n;
			

			while(count>=nst) {
				if(count==row)
					System.out.print("* ");
				else
					System.out.print(count+" ");

				count--;
			}
			
			System.out.println();
			
			row++;
		
		}
	}

}
