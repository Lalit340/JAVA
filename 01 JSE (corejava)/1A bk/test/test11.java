class test11 {
	static int a;

	static {
		System.out.println("Hi");
		a=10;
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	static int b;
	static {
		System.out.println("HRU?");
		b=20;
	}
}
