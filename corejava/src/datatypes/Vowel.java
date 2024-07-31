package datatypes;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the char:");
		char Chr=scan.next().charAt(0);
	//	System.out.println("char is :"+Chr);
		if(Chr=='a')
		{
			 System.out.println("Not allowed !");
		}
		else if( Chr=='e')
		{
			System.out.println("Not allowed !");
		}
		else if(Chr=='i')
		{
			System.out.println("not allowed !");
		}
			
		else if(Chr=='o')
		{
			System.out.println("not allowed !");
		}
		else if(Chr=='u')
		{
			System.out.println("not allowed !");
		}
			
		else
		{
			
			// A-Z=>65-90
			//a-z=>97-122
			int value=Chr; //32=>16 =>
			  System.out.println("not a vowel : So allowed");
			
			  if( value >=65 & value <=90)
			{
				  char c2=(char)(value+32);  //Explicit
			    System.out.println("upper case Input.");
		     	System.out.println("input value:"+Chr);
		     	System.out.println("output value:"+c2);
			
			}
			  else
			  {
			char c2=(char)(value-32);  //Explicit 
			System.out.println("lower case  Input.");
			System.out.println("input value:"+Chr);
			System.out.println("output value:"+c2);
			  }
			
			
			
			
			
			
			
			
		}
		

	}

}
