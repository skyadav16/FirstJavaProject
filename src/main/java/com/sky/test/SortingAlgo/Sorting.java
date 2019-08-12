package com.sky.test.SortingAlgo;

public class Sorting {
	
	public static void main(String... args) {
		
		int[] list = new int[] {8, 3, 9, 1, 7, 2, 6, 10, 5, 4};
		
		System.out.print("unsorted list - ");
		printList(list);
		
		int low = 0;
		int high = list.length;
		list = bubleSort(list, low, high);
		
		System.out.print("sorted list - ");
		printList(list);
		
	}
	
	/**
	 *  8, 3, 9, 1, 7, 2, 6, 10, 5, 4
	 * 
	 */
	
	public static int[] bubleSort(int[] list, int low, int high) {

		for (int i = low; i < high; i++) {
			for (int j = low; j < high - 1 -i; j++ ) {
				if (list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j +1];
					list[j + 1] = temp;
				}
			}
		}
		
		return list;
	}
	
	public static void printList(int[] list) {
		
		for (int i : list) {
			System.out.print(i + ", ");
		}
		System.out.println("\n");
	}

}
