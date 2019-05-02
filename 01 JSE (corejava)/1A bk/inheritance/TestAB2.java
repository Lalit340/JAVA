class TestAB2 {
	public static void main(String[] args) {
		B2 b1=new B2();
		A2 a1=b1;

        B2 b2=new B2();
		A2 a2=b2;

		b1.m3();

        System.out.println(b1.x +" .... "+b1.y);
        System.out.println(a1.x +" .... "+a1.y);

		  System.out.println(b2.x +" .... "+b2.y);
          System.out.println(a2.x +" .... "+a2.y);
          System.out.println();

		  b1.m1();  b2.m1();
		   System.out.println();
            b1.m2();  b2.m2();

	}
}
