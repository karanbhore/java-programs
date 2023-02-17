package DecisionMaking;

public class LeapYear {
	public static void main(String[] args) {
		int y = 2024;
        
		if (y % 400 == 0)
			System.out.println("this is leap year:" + y);
		 if (y % 100 == 0)
			System.out.println("this is leap year:" + y);
		 if (y % 4 == 0)
			System.out.println("this is leap year:" + y);
		 else
			System.out.println("this is normal year:" + y);
		

	}
}
