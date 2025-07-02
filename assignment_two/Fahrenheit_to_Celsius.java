package assignment_two;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minF= sc.nextInt();
		int maxF= sc.nextInt();
		int step= sc.nextInt();
		
		for(int i=minF; i<=maxF; i+=step) {
			int cel = (int) ((i - 32) * 5/9);
			System.out.println(i+"\t"+cel);
		}
		
	}
}
