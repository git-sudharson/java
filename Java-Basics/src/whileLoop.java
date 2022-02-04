import java.util.Scanner;
public class whileLoop {
	
	
	public static void main(String[] args)
	{
		int number, sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("n Please Enter any interger value below 10: ");
		number= sc.nextInt();
		
		while(number<=10)
		{
			sum=sum+number;
			number++;
			
		}
		System.out.format("Sum of the number from the while loop is "+sum);
		
		sc.close(); 
		  
	}
}
//dowhile
	/*	int x=1;
		System.out.println("value of x : ");
		do { 
			
			System.out.println(x);
			x++;
		
			
		}while(x < 11);
		
	}  */
	
//switch case
		
	/*	int tech = 2;
		
		switch(tech)
		{
			case 1:  System.out.println("java");
		  	break;
		  
			case 2: System.out.println("Es6");
			break;
		
			default: System.out.println("Not listed");
		
		}  */
// nested switch
		/*	int tech = 2, course = 2;
		switch(tech)
		{
		
			case 1: System.out.println("python");
			break;
		
			case 2: switch(course)
		      	{
		          		case 1:  System.out.println("J2EE");
		                 break;
		           		case 2: System.out.println("advanced java");
		      	}
		}  */  
				
		
				//java nested for loop 

				/* for(int i=1;i<=3;i++)
					{
						for(int j=i;j<=i;j++)
							{
								System.out.print(" "+i+" " +j+" ");
    						}
								System.out.println();
					} */ 

