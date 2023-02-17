package DecisionMaking;

public class InfosysHire {
	public static void main(String[] args) {
		boolean a = age(30);
		boolean e = drivingExperience(10);
		boolean m = marks12th(50);

		if (a ==true & e == true & m ==true)
			System.out.println("candidate is hired as driver:");
		else
			System.out.println("candidate is not hired as driver:");

	}

	public static boolean age(int n) {
		if (n > 40)
			return true;
		else
			return false;
	}

	public static boolean drivingExperience(int n) {
		if (n >= 10)
			return true;
		else
			return false;
	}

	public static boolean marks12th(int n) {
		if (n > 40)
			return true;
		else
			return false;
	}

}
