package datatypes;

import java.util.Scanner;

public class Voteeligibility {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		int birthyear;
		System.out.println("please enter your YOB:");
		birthyear=scan.nextInt();
		int year=2024;
		
		int age=year-birthyear;
		
		if(age >=18) //age=64=>64-18=>46/5=>9+1=>10
		{
			System.out.println("Your age is: "+age+"years !");
			System.out.println("you are eligible.");
			
			int count=age-18;
			System.out.println("you have voted :"+((count/5)+1)+" :times !");
		}
		else
		{
			System.out.println("Ineligible: eligible in :"+(18-age)+" years !");
		}
		
		

	}

}
