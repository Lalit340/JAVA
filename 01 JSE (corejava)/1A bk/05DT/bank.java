class bank  {
	public static void main(String[] args) {
		System.out.println("creating 2 account holder object");

		account a1=new account();

		a1.aname         ="lalit";
		a1.acc_no          =21619371 ;
		a1.adds            ="hyd";
		a1.balance       =20015.57;

       account a2 =new account();

	   a2.aname         ="sai";
	   a2.acc_no          =81510382;
	   a2.adds            ="hyd";
	   a2.balance      =15150.20;


	   System.out.println("1st account values");
	   System.out.println("a1.aname\t:" + a1.aname);
	   System.out.println("a1.accno\t:" + a1.acc_no);
	   System.out.println("a1.adds\t:" + a1.adds);
	   System.out.println("a1.balance\t:" + a1.balance);

	   System.out.println("2nd account values");
	   System.out.println("a2.aname\t:" + a2.aname);
	   System.out.println("a2.accno\t:"+ a2.acc_no);
	   System.out.println("a2.adds\t:" + a2.adds);
	   System.out.println("a2.balance\t:"  + a2.balance);



       }

}
