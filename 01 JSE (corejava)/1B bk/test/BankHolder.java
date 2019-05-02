public class  BankHolder extends Bank  {
	   private String  HName;
		 private long   AccNo;
		private double balance=10000;

		void  SBank(){
			super.SBank();
			display();
              System.out.println("Some customer present");
		}
		public void Deposite(double amt ){
			this.balance=this.balance+amt;
		}
		public void Withdraw(double amt ){
			this.balance=balance-amt;
		}
		public void setHname(String HName){
			this.HName=HName;
		}
		public String getHname(){
			return HName;
		}
			public void setAccountNo(long AccNo){
			this.AccNo=AccNo;
		}
		public long getAccountNo(){
			return AccNo;
		}


      void display(){

		  System.out.println(super.BankName);
		  System.out.println(super.IFSC);
		  System.out.println(super.Location);
		  System.out.println(HName);
		  System.out.println(AccNo);
		  System.out.println(balance);

	  }

}
