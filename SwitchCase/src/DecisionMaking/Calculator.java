package DecisionMaking;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char operator;
		Double n1, n2, result;

		Scanner input = new Scanner(System.in);
		System.out.println("choose an operator: + , - , * , / ");
		operator = input.next().charAt(0);
		System.out.println("enter n1");
		n1 = input.nextDouble();
		System.out.println("enter n2");
		n2 = input.nextDouble();

		switch (operator) {

		case '+':
			result = n1 + n2;
			System.out.println(n1 + "  " + "+" + n2 + "  " + "=" + result);
			break;

		case '-':
			result = n1 - n2;
			System.out.println(n1 + "  " + "-" + n2 + "  " + "=" + result);
			break;

		case '*':
			result = n1 * n2;
			System.out.println(n1 + "  " + "*" + n2 + "  " + "=" + result);
			break;

		case '/':
			result = n1 / n2;
			System.out.println(n1 + "  " + "/" + n2 + "  " + "=" + result);
			break;

		default:
			System.out.println("invalid operator !");
			break;
		}
		input.close();
	}

}
