package sean.java.util.sort;

import sean.java.util.io.In;


public class SelectionSort {
	
	public static void main(String[] args){
		String[] a = In.readStrings();
		sort(a);
		show(a);
	}

	public static void sort(Comparable[] a){
		 int length = a.length;
		 for(int i = 0; i < length; i++){
			 int min = i;
			 for(int j = i+1; j < length; j++){
				 if(less(a[j], a[min])){
					 min = j;
				 }
			 }
			 
			 //get the min
			 exchange(a, i, min);
		 }
	}
	
	private static void show(Comparable[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	private static boolean less(Comparable v, Comparable w){
		try{
			return v.compareTo(w) < 0;
		}catch(Exception e){
			return false;
		}
	}
	
	private static void exchange(Comparable[] a, int i, int j){
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static boolean isSorted(Comparable[] a){
		for(int i = 1; i< a.length; i++){
			if(less(a[i], a[i-1])){
				return false;
			}
		}
		
		return true;
	}
}
