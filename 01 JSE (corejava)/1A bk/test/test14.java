import java.util.Scanner;
class dividation {
	static void div(int a,int b){
		
		int c=a/b;
		System.out.println("result:"+c);
	}
}
public class test14{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.println("Read values");
        System.out.println("enter fno.");
		int a=scn.nextInt();
        System.out.println("enter sno.");
        int b=scn.nextInt();
	    dividation.div(	a,b);
		

	}
}
