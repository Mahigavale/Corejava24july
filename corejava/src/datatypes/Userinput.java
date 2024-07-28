package datatypes;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		

//		System.out.println("please enter the num1:");
//		num1=scan.nextInt();
//		System.out.println("please enter the num2:");
//		num2=scan.nextInt();
//		
//		System.out.println("the addition is :"+(num1+num2));
//		
		
		float num3=1.0f;
		float num4=1.0f;
		int ans=(int)(num3*num4); //Explicit=>narrowing , loss of information
		//System.out.println(ans);
		
		//byte=>short=>char=>int=>float=>double=>long
		//8bits=>16bits=>=>16bits=>32bits=>64bits=>64bits=>64bits
		
		
		byte b=45; //8bits
		int c=b; //32bits
		System.out.println(c);
		
		int i=34; //32 bits
		byte b1=(byte)i; //8 bits //explicit casting
		System.out.println(b1);

		char chr='#'; //16 bits
		int j=chr;    //32 bits
		System.out.println(j);
		//~`!@#$%^&*():<>":" =>find the ASCII value.//float
		//35.0
	}

}
