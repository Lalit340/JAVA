class  TestABC3{
	static {
		System.out.println("Test class is loaded");
	}
	public static void main(String[] args) {
		B3 b1=new B3();
		C3 c1=new  C3();

		b1.a=15;
		b1.x=16;

		System.out.println("b1.a :"+b1.a);
		System.out.println("c1.a :"+c1.a);

		System.out.println("b1.x :"+b1.x);
		System.out.println("c1.x :"+c1.x);
	}
}
