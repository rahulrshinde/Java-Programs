package Arrays;

import java.util.Scanner;

public class MatrixSub {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r1,r2,c1,c2,row,col;
		
		// Taking Size of MatA and MatB
		System.out.println("Enter Size of MatA: ");
		System.out.println("Row's: ");
		r1=sc.nextInt();
		System.out.println("Col's: ");
		c1=sc.nextInt();
		
		System.out.println("Enter Size of MatB: ");
		System.out.println("Row's: ");
		r2=sc.nextInt();
		System.out.println("Col's: ");
		c2=sc.nextInt();
		
		float MatA [][] = new float[r1][c1];
		float MatB [][] = new float[r2][c2];
		float MatSub [][];
		if(r1==r2 && c1==c2) {
			//Initialization size of Matrix Subtraction
			MatSub = new float [r1][c2];
			
			//Taking Values For Matrix A
			System.out.println("Enter Values For Matrix A: ");
			for(row=0; row<r1; row++) {
				for(col=0; col<c1; col++) {
					MatA [row][col]=sc.nextFloat();
				}
			}
			
			//Display Matrix A
			System.out.println("Matrix A: ");
			for(row=0; row<r1; row++) {
				for(col=0; col<c1; col++) {
					System.out.print(MatA [row][col] + " ");
				}
			System.out.println();
			}
			
			//Taking Values For Matrix B
			System.out.println("Enter Values For Matrix B: ");
			for(row=0; row<r2; row++) {
				for(col=0; col<c2; col++) {
					MatB [row][col]=sc.nextFloat();
				}
			}
			
			//Display Matrix B
			System.out.println("Matrix B: ");
			for(row=0; row<r2; row++) {
				for(col=0; col<c2; col++) {
					System.out.print(MatB [row][col] + " ");
				}
			System.out.println();
			}
			
			// Main Logic for Subtraction
			for(row=0; row<r1; row++) {
				for(col=0; col<c1; col++) {
					MatSub [row][col] = MatA [row][col] - MatB[row][col];
				}
			}
			
			// Display Matrix Subtraction
			System.out.println("Matrix Subtraction: ");
			for(row=0; row<r1; row++) {
				for(col=0; col<c1; col++) {
					System.out.print(MatSub [row][col] + " ");
				}
			System.out.println();
			}
		}
		else {
			System.out.println("Matrix Subtraction is Not Possible");
		}

	}

}
