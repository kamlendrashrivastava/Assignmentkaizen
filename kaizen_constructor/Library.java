package kaizen_constructor;

public class Library {
		String student;
		String subject;
		int idno;
		public Library() {
			System.out.println("information1");
		}
	    public Library(String student,String subject,int idno) {
	    	System.out.println("information2");
	         this.student=student;
	         this.subject=subject;
	         this.idno=idno;  
	    }
	    public static void main(String[] args) {
	    	Library college=new Library();
	    Library Book= new Library("mohit","maths",123);
	    Book.describe();
	    }
		public void describe() {
			System.out.println("Library [student=" + student + ", subject=" + subject + ", idno=" + idno + "]");
		}

}
