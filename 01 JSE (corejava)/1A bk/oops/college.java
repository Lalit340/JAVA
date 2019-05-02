class college {
	public static void main(String[] args) {
	
	student.institute  ="NARESH I TECHNOLOGIES";

     student  s1= new  student();
	
	 s1.sno        =101;
	 s1.sName  ="HK";
	 s1.course   ="cj";
	 s1.fees        =1500;

	 s1.addr   = new address();

	 s1.addr.pin    =761200;
	 s1.addr.city   ="hyd";
	 s1.addr.state   ="TS";
	 System.out.println("HK values are stored in s1 object");

      student  s2= new  student();
	
	 s2.sno          =121;
	 s2.sName   = "BK";
	 s2.course   = "AJ";
	 s2.fees        =2000;

	 s2.addr   = new address();
     
     s2.addr.pin    =761211;
	 s2.addr.city   ="SEC.";
	 s2.addr.state   ="TS";
	 System.out.println("BK values are stored in s1 object");
	 
	 System.out.println("HK values are");
	 System.out.println("s1.sno:\t\t"   +s1.sno);
	 System.out.println("s1.sName:\t\t"   +s1.sName);
	 System.out.println("s1.scourse:\t\t"   +s1.course);
	 System.out.println("s1.fees:\t\t"   +s1.fees);
	 System.out.println("s1.addr.pin:\t\t"   +s1.addr.pin);
	 System.out.println("s1.addr.city:\t\t"   +s1.addr.city);
	 System.out.println("s1.addr.state:\t\t"   +s1.addr.state);

     
	 System.out.println("BK values are");
	 System.out.println("s2.sno:\t\t"   +s2.sno);
	 System.out.println("s2.sName:\t\t"   +s2.sName);
	 System.out.println("s2.scourse:\t\t"   +s2.course);
	 System.out.println("s2.fees:\t\t"   +s2.fees);
	 System.out.println("s2.addr.pin:\t\t"   +s2.addr.pin);
	 System.out.println("s2.addr.city:\t\t"   +s2.addr.city);
	 System.out.println("s2.addr.state:\t\t"   +s2.addr.state);
	}
}
