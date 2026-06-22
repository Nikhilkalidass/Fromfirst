package First;
import java.util.Scanner;
public class Day4 {
public static void main(String args[]) {
	//int[] arr= {12,22,13,25};
	//System.out.println(arr[1]);
	Scanner sc=new Scanner(System.in);
//	int[] a=new int[5];
//	
//	for(int i=0;i<5;i++) {
//		a[i]=sc.nextInt();
//	}
//	for(int i=0;i<5;i++) {
//		System.out.println("Elements of array: "+a[i]);
//	}
//	int[] arr=new int[5];
//	System.out.println("Enter numbers:");
//	for(int i=0;i<arr.length;i++) {
//		System.out.print("Number"+(i+1)+":");
//		arr[i]=sc.nextInt();
//	}
//	System.out.println("Numbers in reverse order");
//	for(int i=arr.length-1;i>=0;i--) {
//		System.out.println(arr[i]+" ");
//	}
	
	int[] arr=new int[5];
	
	System.out.println("Enter the marks for 5 subjects: ");
	for(int i=0;i<arr.length;i++) {
		System.out.println("Mark"+(i+1)+":");
	}
	System.out.println();
	
	
	sc.close();
}
}
