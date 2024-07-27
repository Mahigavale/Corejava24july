package datatypes;

public class Primitive {

	public static void main(String[] args) {
		
		//Primitive data types.
		//1)predefined by java.
		//2)size fixed
		//3)no additional methods.
		//4) lower case
		//5)must save a value. they cannot be null.
		//(2^n)-(1) where n=number of bits.
		
		// byte =>1 byte 8 bits
		//(2^8)-(1)=>255
		//signed => can store negative values.
		//-128 to 127 signed data type.
		// first bit sign decider=> positive // negative
		//age => 0-120
		byte demo=-123;
	    
		
		//short :=> 2  bytes 16 bits
		//signed :=> can store negative values
		//-32768 to 32767 range of short
		//salary => fresher level
		short demo2=32767;
		
		//int :=> 4 bytes 32 bits
		//signed :=>can store negative values.
		//-2147483648 to 2147483647
		
		int demo3=2147483647;
		
		
		//float :=> 4 bytes  32 bits
		// signed :=> can store negative values.
		//can store decimal Points.
		// end the value with "f".
		//up to 6-7 decimal points.
		float demo4=5.12345678f;
		
		//System.out.println(demo4);
	
		//double :=> 8 bytes 64 bits
		//signed :=> can store negative values.
		//no compulsion to end with any specific suffix.
		//up to 15 decimal points.
		double d=5.123456789012345;
		//System.out.println(d);
		
		// boolean => true or false. 1 byte =>8 bit 0/1
		
		boolean b=true;
		boolean b1=false;
		
		
		//char :=> 2 bytes =>16 bits 
		// characters ''
		//A->65 Z->90
		//a->97 z->122
		char c='B';
		char c1=96;
		char c2=567;
//		System.out.println(c);
//		System.out.println(c1);
//		System.out.println(c2);
		//System.out.println(c3);
		
		//long => 8 bytes  =>64 bits
		//end with suffix L
		
		long l1=12345432L;
		//System.out.println(l1);
		
		// class:> Aadharnumber :=>long
		//M/F:> char
		//Precision : decimal => up to 15 decimal
		
		
		// Operators 
		//1)Assign => "="
		
		int i=10;
		int i1=3;
//		double d2=34.56;
//		float f3=4.56f;
//		char c4='n';
		//2)addition
		
		int add=i+i1; //i,i1=> operands operator => +
		int mul=i*i1;
	    int sub=i-i1;
		double div=(i/i1);
		int mod=(i%i1);
		System.out.println("addition is:"+add);
		System.out.println("multiplication is :"+mul);
		System.out.println("substraction is:"+sub);
		System.out.println("divison is :"+div);
		System.out.println("modulus is:"+mod);
		//modulus => remainder
		
		
		
		
	}

}
