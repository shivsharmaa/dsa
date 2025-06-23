package demo;

import java.util.Scanner;
public class PatternHourGlass {

	public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt(), row = 1, nst1=2*n+1, nst2=1, nsp=0;
			
			int count=n;
			int count1=n;
			while(row<=2*n+1) {
				int val=count;
				int cst1=1;
				while(cst1<=nst1) {
					System.out.print(val+" ");
					cst1++;
					if(cst1<=nst1/2) {
						val--;
					}else {
						val++;
					}
				}
				System.out.println();
				if(row<=n) {
					count--;
					nst1--;
				}
				else {
					count++;
					nst1++;
				}
				row++;
			}
		}
	}


