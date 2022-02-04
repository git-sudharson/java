import java.util.Scanner;
public class pyramid
{
    public static void main(String[] args)
	{
		    int rows,count;
			Scanner input= new Scanner(System.in);
			System.out.print(" Enter the number of rows: ");
			rows=input.nextInt();
			
			for(count = 1; count<=rows;count++)
			{
				
		
					for(int i=rows;i>=count;i--)
				 {
					 System.out.print(" ");
				 } 
					      for(int j=1;j<=count;j++)
					          {
					               System.out.print(" *");
				                	 
				              }
				 System.out.println();
				 input.close();
			}    
	}

}

  

