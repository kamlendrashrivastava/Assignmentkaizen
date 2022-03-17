package starpattern;

public class Pco {
	public int add(int a, int b) {
		return a+b;
		}
		public int mul(int i, int j) {
			return i*j;
		}
	public int divide(int k, int m) {
		return (k/m);
		}
	public int sub(int n, int p) {
		return (n-p);
	}
	public static void main(String[] args) {
		Pco fruit=new Pco();
		int i=fruit.add(10, 20);
		System.out.println(i);
		int j=fruit.mul(10,20);
		System.out.println(j);
		int k=fruit.divide(20,10);
		System.out.println(k);
		int l=fruit.sub(20,10);
		System.out.println(l);
	}
		
		}
		
		
		    
		
		



