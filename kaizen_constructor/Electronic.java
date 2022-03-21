package kaizen_constructor;

public class Electronic {
	String name;
	String model;
	String item;
	public Electronic() {
		System.out.println("test");
	}
    public Electronic(String name,String model,String item) {
    	System.out.println("test2");
      this.name=name;
      this.model=model;
      this.item=item;
}
public static void main(String[] args) {
	Electronic c= new Electronic( "A.c","2865","electronic");
	c.describe();
	}
public void describe() {
  System.out.println("Electronic [name=" + name + ", model=" + model + ", item=" + item + "]");
}}