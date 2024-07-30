package datatypes;

public class Preincreament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
//		int num=10;
//		System.out.println(++num); //11
//		System.out.println(num++); //11=>12
//		System.out.println(num);
//		
//		int d=num++ +5; //17 (12+5)=> (12++)
//		System.out.println("post:"+d);
//		int c=++num +5; //(++12 +5) //++13=>14+5=>19
//		System.out.println("pre:"+c); 
		
		
//		
//		int num1=0,num2=1;
//		System.out.println(++num1 + num2++); //2 (1+1) ,2
//		System.out.println(num2++); //2=> 3
//		System.out.println(++num2); //4 =>4
//		System.out.println(num1++); //1
//		
		
		
		//char chr='j';
//		System.out.println(chr++); //j=>k
//		System.out.println(++chr);//k=>l
		
		
//		char ch2='m'; //109
//		int i=ch2;  //109
//		System.out.println(++i);//109=>110 =>110
//		ch2=(char)i ;//explicit; //ch2='n'
//		System.out.println(ch2++); //111 'n'=>0
//		
		
		
		char a='a';
		char b='b';
		char c='c';
		int i=a+b;
		int j=0;
		System.out.println(j+=i);//195
		System.out.println(j%=i);//0
		
	}

}
