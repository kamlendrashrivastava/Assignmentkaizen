package kaizen_constructor;

public class Sports {
	String name;
	String country;
	int id;
	public Sports() {
		System.out.println("Team");
	}
    public Sports(String name,String country,int id) {
    	System.out.println("number");
         this.name=name;
         this.country=country;
         this.id=id;  
    }
    public static void main(String[] args) {
    	Sports player=new Sports();
    Sports c= new Sports("Cricket","india",1245);
    c.describe();
    }
	
	private void describe() {
		System.out.println("Sports [name=" + name + ", country=" + country + ", id=" + id + "]");
	}

}
