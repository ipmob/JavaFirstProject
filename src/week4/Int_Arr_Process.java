package com.sapient.week4;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {

	private int[] arr;
	private int length;

	public Int_Arr_Process(int size) {					// Constructor with param for size
		arr = new int[size];
		length = size ;
		for (int i = 0; i < size; i++) {
			arr[i] = 0;
		}
	}

	public Int_Arr_Process() {							//FallBackConstructor with no param assigned for  10 elem
		this(10);
	}

	public Int_Arr_Process(Int_Arr_Process intArr) {	//Copy constructor	
		arr = new int[intArr.length];
		for (int i = 0; i < intArr.length; i++) {
			this.arr[i] = intArr.arr[i];
		}
	}

	public int[] getArr() {								//returns the current array
		return arr;
	}

	public void setArr(int[] array) {					// Sets the value of integer array by array passed
		for (int i = 0; i < array.length; i++) {
			this.arr[i] = array[i];
		}
	}

	public void setArr() { // Sets the value of integer array by array passed
		System.out.println("Manual INPUT: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.length; i++) {
			this.arr[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void displayArrVertical() {					//prints array vertically
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void displayArrHorizontal() {				//prints array horizontally
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	public void sortArrayInBuilt() {					//Java provideed sort function 
		Arrays.sort(this.arr);

	}
	
	public void sort() {
		sortQuick(0, length - 1);
	}
	
	public void sortQuick(int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			sortQuick( begin, partitionIndex - 1);
			sortQuick(partitionIndex + 1, end);
		}
	}

	private int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;

		return i + 1;
	}
	
	public int calcSum() {
		int sum = 0 ;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public int getMax() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public int getMin() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public int getSecondMax() {
		int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max2 = max ; 
				max = arr[i]; 
			}
			else {
				if (arr[i] > max2)
					max2 = arr[i];
				
			}
		}
		return max2; 
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Object has went out of scope and to garbage collector.");
	}

}
