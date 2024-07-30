package datatypes;

public class Relationaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num1=23;
  int num2=46;
  //1)greater than > either true or false.
  
    System.out.println(num1>num2);
    System.out.println(num2>num1);
    
    //2) less than  <
    System.out.println(num1<num2);
    
    //3) >= <=
    
    int num3=45;
    int num4=46;
    System.out.println("greater than or equal to"+(num3 >=num4));
    System.out.println("less than or equal to"+(num3<=num4));
    
    System.out.println("is equal to"+(num3==num4));
    System.out.println(67==67);
     
    int num6='C'; //implicit
    
    System.out.println(67==num6);
    
    
    System.out.println(5 != 6);
    System.out.println('a' != 'b');
    System.out.println('a'=='b');
    
    
	}

}
