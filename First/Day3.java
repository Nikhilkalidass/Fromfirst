package First;
import java.util.Scanner;
public class Day3 {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	//for(int i=1;i<=100;i++) {
		
		//if(i%2==0) {
			//System.out.println(i);
	//	}
		//else {
		//	System.out.println(i);
	//	}
	//}
	//int i=100;
	//while(i>=1) {
	//	System.out.println(i);
	//	i--;
	//}
	
//	System.out.println("Enter the number:");
	//int n=sc.nextInt();
	
	//int sum=0;
	//for(int i=1;i<=n;i++) {
		//sum+=i;
		
//	}
	//System.out.println("The sum is "+n+" number "+sum);

	        System.out.print("Enter a number to check: ");
	        int num = sc.nextInt();
	        
	        int originalNum = num;
	        int reversed = 0;

	        // Step 1: Reverse the number
	        while (num > 0) {
	            int lastDigit = num % 10;
	            reversed = reversed * 10 + lastDigit;
	           // System.out.println(reversed);
	           // System.out.println(num);
	            num = num / 10;
	        }
	        
	        System.out.println(reversed);
	        // Step 2: Compare the original number with the reversed number
	        if (originalNum == reversed) {
	            System.out.println(originalNum + " is a palindrome number.");
	        } else {
	            System.out.println(originalNum + " is not a palindrome number.");
	        }
	        
	        System.out.print("Enter a number to check: ");
	        int nu= sc.nextInt();
	        int sum=0;
	     
//Keep looping until the number is completely chopped down to 0
while (nu > 0) {
    int lastDigit = nu % 10; // 1. Peel off the last digit
    sum = sum + lastDigit;    // 2. Add it to your total basket
    nu = nu / 10;           // 3. Chop off that last digit
}

System.out.println("The sum of the digits is: " + sum);
sc.close();
}
}
