package array;

public class Array {
	public static void main(String args[]) {
		int[] array = {1,2,3,4,5};
		for(int x: array)
		{
		System.out.println(x)	;
		}
		int[][] array2D= {
				{1,2,3,4,5},
				{7,8,3,4,5}
		};
		for (int i=0; i<2; i++)
		{
			for(int j=0; j<5; j++) {       //array2D[i].length
				System.out.print(array2D[i][j] + " ");
			
		}
		System.out.println();}
	}

}
