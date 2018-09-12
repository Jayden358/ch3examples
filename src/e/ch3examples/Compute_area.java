package e.ch3examples;

import java.util.Scanner;

// Jayden williams
// 9/18
// compute area of circle
public class Compute_area {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			//step one: enter the radius of a circle
			
			double radius;
			double PI = 3.14159;
			double area;
			//assign a value to a radius
			System.out.println("Enter the radius of a circle and press enter");
			radius = input.nextDouble();
			
			
			//step two: compute the area using the following formula
			// area = radius*radius*pi
			area = radius*radius*PI;
			
			
			//step three: display result
			System.out.println("The area of your circle is:" + area +"\"");
		
		
		}
		
}
