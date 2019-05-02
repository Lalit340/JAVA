public class Customer {
	public static void main(String[] args) {
		 BankHolder bh=new  BankHolder();
		 Bank b=bh;
		  bh.Location("Ameer");
		 bh.setHname("LP");
		 bh.setAccountNo(4512365l);
         bh.Deposite(5000);
         bh.Withdraw(7000);
		
		 b.SBank();
		 
	}
}
