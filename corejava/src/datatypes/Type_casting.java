package datatypes;

public class Type_casting {

	public static void main(String[] args) {
		
		byte b=123; //8 bits
		int a=12;
		float f=12.45f;
		double d=345.678;
		
		//implicit casting small data=> large data.
		//widening
		
		int c=(int)b; //32 bits> 8 bits
		//System.out.println("the original data:"+b);
		//System.out.println("the converted data:"+c);
		
		//explicit casting large data=>small data.
		//loss of information here !
		//narrowing
       int d1=(int)d;
       
       System.out.println("the orginal value:"+d);
       System.out.println("the converted value:"+d1);
	}

}
