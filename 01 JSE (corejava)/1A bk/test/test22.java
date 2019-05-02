class test22 {
	static {
		System.out.println("SB start");
		System.out.println("SB end");
    }
	int x=m1();
	int m1(){
				System.out.println("NSV  x");
	        	System.out.println("NSV end");
				return 10;
	} 
	{
		System.out.println("NSB start");
		System.out.println("NSB end");
	}

	public static void main(String[] args) {
		System.out.println("main");
		test22 t =new test22();
		System.out.println("main end");
	}
}
