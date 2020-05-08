package com.sapient;



class Cli {

	int big = Integer.MIN_VALUE;
	int small = Integer.MAX_VALUE;

	int count = 0;
	int sum = 0;
	float average = 0;

	int[] nums;

	public void setData(String args[]) {
		
		this.count = args.length;
		this.nums = new int[this.count];
		for (int i = 0; i < count; i++) {

			nums[i] = Integer.parseInt(args[i]);
		}

	}

	public void calData() {


		for (int i = 0; i < this.count; i++) {
	
			int val = this.nums[i];

			if (val > this.big) {
				this.big = val;
			}

			if (val < this.small) {
				this.small = val;
			}

			this.sum += val;
		}

		this.average = this.sum/this.count;
	}

	public void displayData() {

		System.out.println("The sum is " + this.sum);
		System.out.println("The average is " + this.average);
		System.out.println("The biggest number is " + this.big);
		System.out.println("The smallest number is " + this.small);
	}
}
