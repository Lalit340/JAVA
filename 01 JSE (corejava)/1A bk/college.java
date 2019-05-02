class college {
	public static void main(String[] args) {
		
		student  s1 =new student();
		
		s1.setSno(101);
		s1.setSname("HK");
		s1.setCourse("C.J");
		s1.setFees(1000);
		
		student s2 =new student(102,"BK","Adv.J",1500);
		System.out.println("HK dateils ");
		s1.display();
		System.out.println("BK dateils ");
        s2.display();

	}
}
