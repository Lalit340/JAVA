class test20 { 
	static test20 a=new test20();

	test20(){
		System.out.println("constructor start");
	}
	public static void main(String[] args) {
		System.out.println("main");
		test20 a =new test20();

	}
}
