package DecisionMaking;

import java.util.Scanner;

public class City {
	public static void main(String[] args) {
		String city;
		Scanner in = new Scanner(System.in);
		System.out.println("enter city");
		city = in.next();
		

		switch (city) {

		case "kolhapur":
			System.out.println("gulachi bajarpet ");
			break;
		case "pune":
			System.out.println("videche maherghar");
			break;
		case "mumbai":
			System.out.println("chakaramanyanche gav");
			break;
		default:
			System.out.println("invalid city");

		}
		in.close();
	}

}
