package datatypes;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		
		
		
		System.out.println("************FOR LOOP************");
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the input number:");
		//1,3,5,7,9,11=> (not allowed)
		//2,4,6=>(num*1,,,,,num*5)
		int num=scan.nextInt();
		
		if(num %2==0)
		{
			System.out.println("it is even !");
			
			for(int i=1;i<=5;i++)
			{
				System.out.println(num*i);
			}
			
		}
		else
		{
			System.out.println("it is odd !");
		}
		
		
     //prime=>13 (1,13)(2,12)
}
}