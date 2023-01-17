package Arrays;

import java.util.Scanner;

public class MatrixMulB {

	public static void main(String[] args) {
		int r1,c1,r2,c2;
		Scanner sc = new Scanner(System.in);
		
		// Matrix A Input
		System.out.println("Enter Row's in Matrix A: ");
		r1 = sc.nextInt();
		System.out.println("Enter Col's in Matrix A: ");
		c1 = sc.nextInt();
		
		// Matrix B Input
		System.out.println("Enter Row's in Matrix B: ");
		r2 = sc.nextInt();
		System.out.println("Enter Col's in Matrix B: ");
		c2 = sc.nextInt();
		
		int MatA [][] = new int [r1][c1];
		int MatB [][] = new int [r2][c2];
		int MatMul [][] = new int [r1][c2];
		
		// Taking Matrix A
		System.out.println("Matrix A: ");
		for(int row=0; row<r1; row++) {
			for(int col=0; col<c1; col++) {
				MatA [row][col] = sc.nextInt();
			}
		}
		
		// Display Matrix A
		System.out.println("Matrix A: ");
		for(int row=0; row<r1; row++) {
			for(int col=0; col<c1; col++) {
				System.out.println(MatA[row][col]);
			}
		}
		
		// Taking Matrix B
		System.out.println("Matrix B: ");
		for(int row=0; row<r2; row++) {
			for(int col=0; col<c2; col++) {
					MatB [row][col] = sc.nextInt();
			}
		}
				
		// Display Matrix B
		System.out.println("Matrix B: ");
		for(int row=0; row<r1; row++) {
			for(int col=0; col<c1; col++) {
				System.out.println(MatB[row][col]);
			}
		}
		
		// Main Logic
		
		for(int row=0; row<r1; row++) {
			for(int col=0; col<c2; col++) {
					MatMul [row][col] = 0;
					for(int temp=0; temp<c1;temp++) {
						MatMul[row][col] += MatA[row][temp] * MatB[temp][col];
					}
			}
		}
				
		// Display Matrix C
		System.out.println("Matrix C: ");
		for(int row=0; row<r1; row++) {
			for(int col=0; col<c2; col++) {
				System.out.print(MatMul[row][col] + " ");
			}
			System.out.println();
		}

	}

}
