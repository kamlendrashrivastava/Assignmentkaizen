package kaizen_constructor;

public class Bank {
	String name;
	String branch;
	int idno;
	String type;
	public Bank() {
		System.out.println("information1");
	}
    public Bank(String name,String branch,int idno, String type) {
    	System.out.println("information2");
         this.name=name;
         this.branch=branch;
         this.idno=idno;
         this.type=type;
    }
    public static void main(String[] args) {
    	Bank manager=new Bank();
    Bank rupees= new Bank("rajendra","sbi",123,"saving");
    rupees.describe();

}
	public void describe() {
  System.out.println("Bank [name=" + name + ", branch=" + branch + ", idno=" + idno + ", type=" + type + "]");
	}}
