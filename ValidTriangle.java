import java.util.Scanner;

public class ValidTriangle {
// Global variables.
	private static float side1, side2, side3;
	
	public static void main(String[] args) {
		getLengthOfSides ();
		checkIfTriangle ();
	}

	private static void getLengthOfSides() {
		// Read in the length of each side of the triangle.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the length of side 1: ");
		side1 = sc.nextFloat();
		System.out.print("Enter the length of side 2: ");
		side2 = sc.nextFloat();
		System.out.print("Enter the length of side 3: ");
		side3 = sc.nextFloat ();
	}

	private static void checkIfTriangle() {
		// Check to see if a triangle can be drawn from those measurements.
		
		if (side1 + side2 <= side3)
			System.out.println ("Invalid triangle measurements - side 1 + side 2 < side 3");
		else if (side1 + side3 <= side2)
			System.out.println ("Invalid triangle measurements - side 1 + side 3 < side 2");
		else if (side2 + side3 <= side1)
			System.out.println ("Invalid triangle measurements - side 2 + side 3 < side 1");
		else
			System.out.println ("\nThese are valid triangular measurements.");
	}

}
