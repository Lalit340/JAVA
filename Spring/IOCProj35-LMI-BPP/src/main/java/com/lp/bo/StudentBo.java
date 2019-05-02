package com.lp.bo;

public class StudentBo extends BeanBo {
        private String  course;

        
		public StudentBo() {
			System.out.println("StudentBo.StudentBo()");
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		@Override
		public String toString() {
			return "StudentBo [course=" + course + ", getId()=" + getId() + ", getName()=" + getName() + ", getDoj()="
					+ getDoj() + "]";
		}
		
}
