package Arrays;

import java.util.Scanner;

public class MatrixMul {

	public static void main(String[] args) {
		int row1, col1, row2, col2;
	    Scanner sc = new Scanner(System.in);

	    // Input dimensions of First Matrix: A
	    System.out.print("Enter number of rows in first matrix: ");
	    row1 = sc.nextInt();

	    System.out.print("Enter number of columns in first matrix: ");
	    col1 = sc.nextInt();

	    // Input dimensions of second matrix: B
	    System.out.print("Enter number of rows in second matrix: ");
	    row2 = sc.nextInt();

	    System.out.print("Enter number of columns in second matrix: ");
	    col2 = sc.nextInt();

	    // Requirement check for matrix multiplication
	    if (col1 != row2) {
	      System.out.println("Matrix multiplication is not possible");
	      return;
	    }

	    int MatA[][] = new int[row1][col1];
	    int MatB[][] = new int[row2][col2];
	    int MatMul[][] = new int[row1][col2];

	    // Input the values of matrices
	    System.out.println("\nEnter values for matrix A : ");
	    for (int i = 0; i < row1; i++) {
	      for (int j = 0; j < col1; j++) MatA[i][j] = sc.nextInt();
	    }
	    System.out.println("\nEnter values for matrix B : ");
	    for (int i = 0; i < row2; i++) {
	      for (int j = 0; j < col2; j++) MatB[i][j] = sc.nextInt();
	    }

	    // Perform matrix multiplication
	    // Using for loop
	    System.out.println("\nMatrix multiplication is : ");
	    for (int i = 0; i < row1; i++) {
	      for (int j = 0; j < col2; j++) {
	        // Initialize the element MatMul(i,j) with zero
	        MatMul[i][j] = 0;

	        // Dot product calculation
	        for (int k = 0; k < col1; k++) {
	          MatMul[i][j] += MatA[i][k] * MatB[k][j];
	        }
	        
	        System.out.print(MatMul[i][j] + " ");
	      }
	      System.out.println();
	    }

	}

}
