package datatypes;

public class Whileex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//5=>num
		//System.out.println(num*1)*10;
		
		int num=5; 
		int multiplier=1;
		//while => (condition)? execute:skip 
		
		while(multiplier <=10) //1 <=10=>true //false
		{
			// System.out.println(num* multiplier); //5*1
			 multiplier++; //post-increament. //11
			 // multiplier +=1;  //short hand for assignment.
 
		}
		
		//System.out.println("program finished !");
		int num3=10;
		
		while(num3 <10) //<,<=  (10<10)=>false
		{
			System.out.println("Print ");
			num3++;
		}
		System.out.println("**********THE END********");
	}

}
