import java.util.Scanner;
public class if_else {
	public static void main(String[] args)
	{
		
		
		//odd or even.
	 	int num;
		System.out.println("Enter an integer number");
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		if(num%2==0)
			System.out.println("entered number is even");
		else
			System.out.println("entered number is odd");
	        scan.close();
	        
	     // finding vowels
	/*		char ch='i';
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				System.out.println(ch + " is vowel");
			else
				System.out.println(ch + " is consonant");  */
			
			//finding greater value
			
	/*	double n1= -5.5, n2=4.5, n3=3.5;
			if(n1>= n2 &&  n1 >= n3)
				System.out.println(n1 + " is the largest number");
			else if(n2 >= n1 && n2 >= n3)
				System.out.println(n2 + " is the largest number");
			else
				System.out.println(n3 + " is the largest number");  */
						
			
			// given number is odd or even 
	  /*  	Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number ");
			int num = scan.nextInt();
			
			if(num%2==0)
				System.out.println(" the given number is even ");
			else
				System.out.println(" the given number is odd ");
			scan.close();  */  
			
			
	}

}
