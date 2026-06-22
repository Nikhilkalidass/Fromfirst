package First;
import java.util.Scanner;
public class Day2 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your number1:");
	int num1=sc.nextInt();
	
	System.out.println("Enter your number2:");
	int num2=sc.nextInt();
	
	System.out.println("Enter your number3:");
	int num3=sc.nextInt();
	
	if(num1>=num2 && num1>=num3) {
		System.out.println(num1+"is the largest");
	}
	else if(num2>=num1 && num2>=num3)
	{
		System.out.println(num2+"is the largest");
	}
	else
	{
		System.out.println(num3+"is the largest");
	}
	
	System.out.println("Enter the day:");
	int day=sc.nextInt();
	
	switch(day) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
		default:
			System.out.println("Invalid day");
			break;
		
	}
	
	
	sc.close();
}
}
