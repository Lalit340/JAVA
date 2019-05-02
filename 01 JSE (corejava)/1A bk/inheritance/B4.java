class  B4 extends A4{
     void m1(){
	  System.out.println("B4 m1");
	}
	void m3(){
		System.out.println("B4 m3");
		m1();
		super.m2();
	}
}
