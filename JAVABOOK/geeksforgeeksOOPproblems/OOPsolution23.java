import java.util.Scanner;

class Matrix {
	private int[][] matrix;
	private int row;
	private int column;

	public Matrix (int row, int column) {
		this.row = row;
		this.column = column;
		this.matrix = new int[row][column];
		for(int i  = 0; i < row; i++) {
			for(int j = 0; j < column; j++){
				matrix[i][j] = i + j;
			}
		}
	}
	
	public void displayMatrix() {
		System.out.println("Matrix row: " + row);
		System.out.println("Matrix column: " + column);
		System.out.println("The matrix");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
	}	
							
}

public class OOPsolution23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

                System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of coumns : ");
		int column = sc.nextInt();

		Matrix matrix1 = new Matrix(rows, column);
		matrix1.displayMatrix();
	}
}
