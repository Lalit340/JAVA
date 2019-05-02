class  bank {
	public static void main(String[] args) {

        custemer b1 = new custemer();
        custemer b2 = new custemer();
       
	    b1.accNo              =40134556;
		b1.aName            ="HK";
		b1.branch            ="ameerpet";
		b1.ifsc                   ="SBI3014da";
		b1.balance           =50556.75;
		//System.out.println("HK value stored in b1 ");
              
	    b2.accNo              =40134565;
		b2.aName            ="BK";
		b2.branch            ="JHills";
		b2.ifsc                   ="SBI4014da";
		b2.balance           =10240556.75;
		//System.out.println("BK value stored in b2 ");

		System.out.println("\nHK values ");

		System.out.println(b1.accNo);
		System.out.println(b1.aName);
		System.out.println(b1.branch);
		System.out.println(b1.ifsc);
		System.out.println(b1.balance);
        
		System.out.println("\nBK values ");

		System.out.println(b2.accNo);
		System.out.println(b2.aName);
		System.out.println(b2.branch);
		System.out.println(b2.ifsc);
		System.out.println(b2.balance);
        



	}
}
