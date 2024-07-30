package datatypes;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("pleae enter the value:");
		num=scan.nextInt();  //num=89
	
			
		
		if(num < 0) //0<0=>false
		{
			 System.out.println("negative !");
		}
		else if(num >0) //0>0=>false
		{
			 System.out.println("Positive !");
		}
//		else if()
//		{
//			
//		}
//		else if()
//		{
//			
//		}
//		else if()
//		{
//			
//		}
//		else
//		{
//			System.out.println("numbe is zero !");
//		}
		
	}

}
