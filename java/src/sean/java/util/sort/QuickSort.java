package sean.java.util.sort;


public class QuickSort {
	
	public static void main(String[] args){
		
	}

	public static void sort(Comparable[] a){
		 
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
