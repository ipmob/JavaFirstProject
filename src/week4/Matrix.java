package com.sapient.week4;

import java.util.Scanner;

public class Matrix {

	int[][] matrix;
	int rowCount, colCount;

	public Matrix(int row, int col) {
		rowCount = row;
		colCount = col;

		matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = 0;
			}
		}
	}

	public Matrix() {
		this(3, 3);
	}

	public Matrix(Matrix mat) {
		this(mat.rowCount, mat.colCount);

		for (int i = 0; i < mat.rowCount; i++) {
			for (int j = 0; j < mat.colCount; j++) {
				matrix[i][j] = mat.matrix[i][j];
			}
		}
	}

	public void setMatrix() {
		System.out.println("Manual Input : ");
		Scanner sc = new Scanner(System.in);
		int temp;
		for (int i = 0; i < this.rowCount; i++) {
			for (int j = 0; j < this.colCount; j++) {
				temp = sc.nextInt();
				matrix[i][j] = temp;
			}
		}
		sc.close();
	}

	public void setMatrix(Matrix mat) {
		for (int i = 0; i < mat.rowCount; i++) {
			for (int j = 0; j < mat.colCount; j++) {
				matrix[i][j] = mat.matrix[i][j];
			}
		}
	}

	public void setMatrix(int[][] mat) {
		for (int i = 0; i < this.rowCount; i++) {
			for (int j = 0; j < this.colCount; j++) {
				matrix[i][j] = mat[i][j];
			}
		}
	}

	public void printMatrix() {
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.printf("\n");
		}
	}

	public Matrix addMatrices(Matrix M) {
		Matrix temp = new Matrix(rowCount, colCount);
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				temp.matrix[i][j] = this.matrix[i][j] + M.matrix[i][j];
			}
		}
		return temp;
	}

	public boolean isScalar() {
		int scalarValue = matrix[0][0];
		if (scalarValue == 0)
			return false;

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				if ((i != j) && matrix[i][j] != 0)
					return false;
				if ((i == j) && matrix[i][j] != scalarValue)
					return false;
			}
		}
		return true;
	}

	public Matrix multiplyMatrices(Matrix M) {
		if (colCount != M.rowCount)
			return null;

		Matrix temp = new Matrix(rowCount, M.colCount);
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < M.colCount; j++) {
				int sum = 0;
				for (int k = 0; k < colCount; k++) {
					sum = sum + this.matrix[i][k] * M.matrix[k][j];
				}
				temp.matrix[i][j] = sum;
			}
		}
		return temp;
	}

}
