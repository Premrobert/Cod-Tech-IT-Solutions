import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		char operator;
		double a, b;
		System.out.println(" 1- Addition  2- Subtract \n 3- Multiplication  4-Division");
		System.out.println("Choose Operator to perform calculation ");
		Scanner sc = new Scanner(System.in);
		operator = sc.next().charAt(0);
		System.out.println("Enter First number");
		a = sc.nextDouble();
		System.out.println("Enter Second number");
		b = sc.nextDouble();

		switch (operator) {
		case '1':
			System.out.println("Addition of two numbers " + a + " & " + +b + " is " + +(a + b));
			break;

		case '2':
			System.out.println("Subtraction of two numbers " + a + " & " + +b + " is " + +(a - b));
			break;

		case '3':
			System.out.println("Multiplication of two numbers " + a + " & " + +b + " is " + +(a * b));
			break;

		case '4':
			System.out.println("Division of two numbers " + a + " & " + +b + " is " + +(a / b));
			break;

		default:
			System.out.println("Enter a valid operator");
		}

	}

}
