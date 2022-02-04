import java.util.Scanner;
public class Floyd_triangle
{

	
	public static void main(String[] args)
	{
		
		//Floyd Triangle
		     
			int rows, number=1, count, j;
			Scanner input= new Scanner(System.in);
					System.out.println(" Enter the number of rows for floyd's triangle: ");
			rows= input.nextInt();
			System.out.println("Floyd's triangle");
			
			System.out.println("**************");
			for(count = 1; count<=rows;count++)
			{
				
		
				
				
				for(int p=rows;p>=count;p--)
				 {
					 System.out.print(" ");
				 } 
					      for(j=1;j<=count;j++)
					          {
					               System.out.print(" "+number);
				                	 number++;
				              }
				 System.out.println();
				 input.close();
			}    
	}

}

  

