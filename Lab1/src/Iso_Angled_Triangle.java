import java.util.Scanner;

/**
 * This class performs calculations on an isosceles triangle.
 * It includes 2 methods for calculating area and parameter of the triangle
 * @author Domhnall ó Póil
 * @version 1.0
 * @since 08 Feb 2016
 */
public class Iso_Angled_Triangle {

	/**
	 * Calculate the parameter of a triangle
	 * @param equalSides double
	 * @param oddSide double
	 * @return parameter double 
	 */
	public static double parameter(double evenSides, double oddSide)
	{
		return (evenSides*2)+oddSide;
		/**
		 * WHEN I WAS
		 * A YOUNG BOY
		 * MY FATHER
		 * TOOK ME INTO THE CITY
		 * TO SEE A MARCHING BAND
		 */
	}
	
	/**
	 * Calculate area of a triangle
	 * @param equalSides double
	 * @param oddSide double
	 * @return Area double 
	 */
	
	public static double area(double a, double b)
	{
		return (b/4)*Math.sqrt((4*a*a)-(b*b));
		/**
		 * HE SAID SON WHEN
		 * YOU GROW UP
		 * WILL YOU BE 
		 * THE SAVIOUR OF THE BROKEN
		 * THE BEATEN AND THE DAMNED
		 */
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter the length of the 2 equal sides");
		Scanner scanner = new Scanner(System.in);
		double equalSides = scanner.nextDouble();
		System.out.println("Enter the length of the odd side");
		double oddSide = scanner.nextDouble();
		System.out.println("the parameter of this triangle is "+ parameter(equalSides,oddSide) + "m");
		
		System.out.println("the area of this triangle is "+ area(equalSides,oddSide) + "m");
		scanner.close();
	}
}