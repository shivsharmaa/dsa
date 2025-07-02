package demo;

public class Swap {
	public static void main(String[] args) {
		int a=10;
		int b= 20;
		
		swap(a,b);
	
	}
	
	public static void swap(int a, int b) {
		int t=a;
		a=b;
		b=t;
		
		System.out.println(a+" "+b);
	}
}
