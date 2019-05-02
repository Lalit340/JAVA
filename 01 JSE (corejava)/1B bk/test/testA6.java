class testA6 {
	 static int a=10;
	  double d=20.0;

    static void m1(){
             System.out.println("testA  static method");
	}
	void m2(){
		System.out.println("testA overriden method");
	}
	void m2(char c){
		System.out.println("char param");
		System.out.println(c);
		m1();
	}
	public void m2(float f){
		System.out.println("float param");
		System.out.println(f);
	}

}
