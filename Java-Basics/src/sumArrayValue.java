import java.util.Scanner;
public class sumArrayValue {
 public static void main(String[] args)
 {
	/* int[] array = {10,20,30,40,50,10};
	 int sum = 0;
	 for(int num : array)
	 {
		 sum = sum + num;
	 }
	 System.out.println("Sum of array elements is " +sum); */
	 
	 //user input array elements
	 
	 Scanner scan = new Scanner(System.in);
	 int[] array = new int[10];
	 int sum =0;
	 
	 System.out.println("Enter the element ");
	 for(int i=0;i<10;i++)
	 {
		 array[i] = scan.nextInt();
		   
	 }
	 for(int num : array)
		 sum = sum+num;
	 System.out.println("sum of array elements is " +sum);
	 scan.close();
 }
 
}
