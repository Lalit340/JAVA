class test15 {
	static int a=10;
		
	static {
		System.out.println(a);
		
		System.out.println(test15.a);
		System.out.println(test15.b);
	}

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println(a);
		System.out.println(b);
	}
     static int b=20;

}
