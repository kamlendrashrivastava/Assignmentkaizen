package kaizen_constructor;

public class Fruit {
	String name;
	String colour;
	String item;
	int price;
	public Fruit() {
		System.out.println("test");
	}
	public Fruit(String name, String colour,String item,int price) {
		System.out.println("type");
		this.name=name;
		this.colour=colour;
		this.item=item;
		this.price=price;
	}
	public static void main(String[] args) {
		Fruit type = new Fruit("banana","green","fruit",245);
		type.describe();
	}
	public void describe() {
   System.out.println("Fruit [name=" + name + ", colour=" + colour + ", item=" + item + ", price=" + price + "]");
	}
	

}
