public class  testB7 extends testA7{
	
      static int b =20;
	
	static {
		     System.out.println("B static block");
          System.out.println(a);
         System.out.println(b);
          System.out.println(getB());
          System.out.println();
	}
	static int getB(){
	return b;
}
	public static void main(String[] args) 	{

		System.out.println("B main");
		System.out.println(a);
		System.out.println(b);
	}
}
