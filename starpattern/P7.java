package starpattern;

public class P7 {
	public static void main(String args[]) {
		int n=4;
		for(int i=1; i<=n;i++) {
			for(int j=i;j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			for(int i=-0; i<=4; i++) {
				{  
				for (int j=1; j<=i; j++)  
				{  
				System.out.print(" ");  
				}  
				for (int k=4; k>=i; k--)  
				{  
				System.out.print("*");  
				}  
				for(int l=3;l>=i;l--) {
					System.out.print("*");
				}
				System.out.println();
				}  
				}
				}
				}
				



