class Bank {
	public static void main(String[] args) {
	    bankAccount acc1 = new bankAccount(10234,"HK",100000);
		bankAccount  acc2= new bankAccount(10564,"BK",200000);

		System.out.println(" acc1 all details");
		acc1.Display();
		System.out.println(" acc2 all details");
	    acc2.Display();
        
		acc1.deposite(5000);
		acc2.deposite(8000);
		System.out.println("\nCASH deposited in two accounts");

        acc1.currentBalance();
        acc2.currentBalance();
		
		acc1.withdraw(3000);
		acc2.withdraw(6000);
		System.out.println("\nCASH withdraw in two accounts");

       acc1.currentBalance();
       acc2.currentBalance(); 
	}

}
