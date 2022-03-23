package main;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(41);
		arr.add(29);
		arr.add(-40);
		arr.add(2);
		arr.add(142);
		arr.add(-22);
		arr.add(37);
		arr.add(-7);
		arr.add(91);
		arr.add(-1);
		
		//Entrada
		//ARR,GOAL
		int index = binSearch(arr, 2);
		if(index != -1) {
			System.out.println(arr.get(index));
		}else {
			System.out.println("no ecsiste");
		}
		
		
		
		//Salidas
		//Entradas
	}
	
	
	public static int binSearch(ArrayList<Integer>arr, int goal) {
		Collections.sort(arr);
		int first = 0;
		int last = arr.size() - 1;
		while(first <= last) {
			int midpoint = (int) (first + last) / 2;
			if(goal == arr.get(midpoint)) {
				return midpoint;
			}else if (arr.get(midpoint) > goal) {
				last = midpoint - 1;
			}else if (arr.get(midpoint) < goal) {
				first = midpoint + 1;
			}
		}
		return -1;
	}
	
	public static int seqSearch(ArrayList<Integer>arr, int goal) {
		for(int i = 0; i<arr.size(); i++) {
			if(goal == arr.get(i)) {
				return i;
			}
		}
		return -1;
	}
}
