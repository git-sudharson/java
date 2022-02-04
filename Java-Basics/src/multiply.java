import java.util.Scanner;
public class multiply {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Enter value for i ");
	short i = scan.nextShort();
	
	System.out.println("Enter value for j ");
	short j = scan.nextShort();
	
	int mul=i*j;
	System.out.println("the multiplication of i and j is " + mul);
	scan.close();
	
	}  

}


//Area of triangle
/*  Scanner scan = new Scanner(System.in);
     System.out.println("Enter the width  of triangle");
	double base = scan.nextDouble();
	System.out.println("Enter the height of  trianglee ");
	double height  = scan.nextDouble();
	double area = (base*height)/2;
	System.out.println("Area of triangle is: " +area);
	scan.close();  */

	// Area of a circle

	/*	System.out.println("Enter the radius ");
	Scanner scan = new Scanner(System.in);
	double radius = scan.nextDouble();
	double circumference = Math.PI * 2*radius;
	System.out.println("The circumference of the circle is " +circumference);
	scan.close();      */





