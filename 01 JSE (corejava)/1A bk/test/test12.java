import java.util.Scanner;
class  addition{
     static  void add(int a,int b){
//		System.out.println("\n add method execution is started");
		int c =a+b;
//		System.out.println("addition logic is executed");
		System.out.println("result:"+c);
//		System.out.println("add execution is end");
	}

	
}
public class test12{
	public static void main(String[] args){
	//	System.out.println("\n mm execution is started");
		Scanner scn =new Scanner(System.in);
	// System.out.println("connection is created to kb");
		System.out.println("reading values");
		System.out.println("enter fno.");
		int a=scn.nextInt();
		System.out.println("enter sno.");
		int b =scn.nextInt();
		System.out.println("add method is called \n by passing given variable "+a+ "and "+b);
		addition.add(a,b);
		System.out.println("mm execution is end");
	}
}