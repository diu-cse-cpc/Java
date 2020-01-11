import java.util.Scanner;

public class JavaArray {
	int i=8;

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

//		int rollNumbers[] = new int[5];
//
//		rollNumbers[0] = 1;
//		rollNumbers[1+1] = 13;
//		rollNumbers[1] = 5;
//		rollNumbers[3] = 17;
//		rollNumbers[4] = 19;
//		
//		
//		
//		System.out.println(rollNumbers.length);
//		
//		
//		
//		for (int i = 0; i < 5; i++) {
//			
//			System.out.println(rollNumbers[i]);
//		}
//		
//		
//		for(int i=0; i<6;i++) {
//			for(int j=0;j<6; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//2D Array
		System.out.println("Enter Row Number");
		int row= scanner.nextInt();
		System.out.println("Enter col Number");
		int col= scanner.nextInt();
		int matrix[][]= new int [row][col];
//		int dumi[][]= {
//				{3,5,6}
//				,{3,5,6}
//				};
		
		for(int i = 0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println("Row["+i+"] Col["+j+"]");
				matrix[i][j]=scanner.nextInt();
			}
		}
		
		for(int i = 0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
