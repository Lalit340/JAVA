class  test26{
	public static void main(String[] args) {
		test25 t=new test25();
		t.m1(10,30.0f);
		t.m1(10.0f, 20);
	//	t.m1(10, 20);     // CE:: IT'S SHOWS AMBIGUOS  ERROR
		System.out.println("Hello World!");
	}
}
