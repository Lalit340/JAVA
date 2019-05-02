package com.lp.bo;

public class EmployeeBo extends BeanBo {
         private String desg;
  
         
		public EmployeeBo() {
			System.out.println("EmployeeBo.EmployeeBo()");
		}

		public String getDesg() {
			return desg;
		}

		public void setDesg(String desg) {
			this.desg = desg;
		}

		@Override
		public String toString() {
			return "EmployeeBo [desg=" + desg + ", getId()=" + getId() + ", getName()=" + getName() + ", getDoj()="
					+ getDoj() + "]";
		}
		
}
