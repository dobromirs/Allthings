package inputOutput;

import java.util.Scanner;

public class PerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double perimeter;
		double area;
		
		System.out.println("Enter the radius of circle: ");
		double radius = input.nextInt();
		
		perimeter = 2 * Math.PI * radius;
		area = Math.PI * radius * radius;
		
		System.out.printf("The perimeter of circle is: %f%n", perimeter);
		System.out.printf("The area of circle is: %f%n", area);
		
	}
}
