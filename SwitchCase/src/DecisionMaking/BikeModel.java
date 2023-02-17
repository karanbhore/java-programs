package DecisionMaking;

import java.util.Scanner;

public class BikeModel {
	public static void main(String[] args) {
		int model;
		Scanner input = new Scanner(System.in);
		System.out.println("enter model no:");
		model = input.nextInt();

		switch (model) {

		case 350:
			System.out.println("available in white colour");
			System.out.println("2lakh");
			break;

		case 550:
			System.out.println("black colour");
			System.out.println("3lakh");
			break;

		default:
			System.out.println("invalid model");
			break;

		}
		input.close();
	}

}
