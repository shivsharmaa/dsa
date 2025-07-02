package demo;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		reverse(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void reverse(int[] arr) {
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			int t=arr[i];
			arr[i]= arr[j];
			arr[j]=t;
			
			
			
			i++;
			j--;
		}
		
	
		
	}
}
