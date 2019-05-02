class test17 {
	static int a =20;
	static {
		System.out.println(a);
		System.out.println(getB());
		System.out.println(test17.b);
	}
	public static void main(String[] args) {

		System.out.println(a);
		System.out.println(b);
	}
	static int getB(){
		return b;
    }
	static int b =30;

}
