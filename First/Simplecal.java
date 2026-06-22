package First;
import java.util.Scanner;
public class Simplecal {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("--Simple Calculator--");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("Choose an option (1-4):");
	int choice=sc.nextInt();
	
	System.out.println("Enter first number:");
	double num1=sc.nextDouble();
	
	System.out.println("Enter second number:");
	double num2=sc.nextDouble();
	
switch(choice) {

case 1:
	System.out.println("Result: "+num1+"+"+num2+"="+(num1+num2));
	break;
	
case 2:
	System.out.println("Result: "+num1+"-"+num2+"="+(num1-num2));
	break;
	
case 3:
	System.out.println("Result: "+num1+"*"+num2+"="+(num1*num2));
	break;
	
case 4:
	if(num2!=0) {
		System.out.println("Result: "+num1+"/"+num2+"="+(num1/num2));
	}
	else {
		System.out.println("Error:Division by zero not allowed.");
	}
	break;
	default:
		System.out.println("Invalid choice choose option 1 to 4");
		break;
}

System.out.println("Enter your year:");
int year=sc.nextInt();
if((year%4==0 && year %100!=0)||year%400==0)
{
	System.out.println("It's a leap year");
}
else
{
	System.out.println("Not a leap year");
}
sc.close();
}
}
