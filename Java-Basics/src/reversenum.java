import java.util.Scanner;
public class reversenum {
    public static void main(String[] args)
    {
    	
    	int num=0;
    	int reversenum= 0;
    	System.out.print("Input your name and press enter ");
    	Scanner scan = new Scanner(System.in);
    	num = scan.nextInt();
    	while(num !=0)
    	{ 
    		  reversenum = reversenum * 10;
    		  reversenum = reversenum + num%10;
    		  num = num/10;
    		  
    	}
    	System.out.println("Reverse of input number is " + reversenum);
    	scan.close();
    	
    	
    	// swap string 
		
    	/*	String first = "M" , second = "sudharson" , temp;
    				
    		
    		System.out.println("----Before swap------");
    		System.out.println(" string is " + first + " " + second);
    		
    		
    		temp = first;
    		first= second;
    		second= temp;
    		System.out.println("----After swap------");
    		System.out.print(" string is " + first +" " +second);  */
    }
}
     
    
              