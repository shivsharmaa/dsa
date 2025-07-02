package assignment_two;

import java.util.Scanner;

public class PrintArmstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
		while (N1 <= N2) {
			int OriginalNum=N1;
			int temp = N1;
			long sum = 0;

			int count = 0;
			while (temp > 0) {

				count++;
				temp /= 10;
			}
				temp = N1;
			while (temp > 0) {
				long rem = temp % 10;
				sum = sum + (long) Math.pow(rem, count);

				temp = temp / 10;
			}

			if (sum == OriginalNum) {
				System.out.println(OriginalNum);
			}
		
			N1++;
			}
		}
	}

