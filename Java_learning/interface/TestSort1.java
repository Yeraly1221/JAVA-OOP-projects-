//7. Write a Java program to create an interface Sortable with a method sort() that sorts an array of
// integers in ascending order. Create two classes BubbleSort and SelectionSort that implement the Sortable 
//interface and provide their own implementations of the sort() method. 
interface  Sort {
	public int[] sort(int[] a);
}

class BubbleSort implements Sort{
	public int[] sort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			boolean flag = false;
			for(int j = 0; j < a.length - i - 1; j++) {
				if(a[j] > a[j + 1]) {
					int it = a[j + 1];
					a[j + 1] = a[j];
					a[j] = it;
					flag = true;
				}
			}
			if(!flag){
				break;
			}	
		}
		return a;
	}
}

class SelectionSort implements Sort {
	public int[] sort(int[] a) {
		for(int i = 0;  i < a.length; i++) {
			int minInd = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] <  a[minInd]) {
					minInd = j;
				}
			}
			int it = a[i];
			a[i] = a[minInd];
			a[minInd] = it;
		}
		return a;
	}
}

public class TestSort1 {
	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		SelectionSort s = new SelectionSort();

		int[] arr1 = {7, 56, 90, 4, 123, 87};
		System.out.print("Unsorted array: ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		arr1 = b.sort(arr1);
		System.out.println();
		System.out.print("Sorted array with bubble sorting: ");
		for(int i = 0; i < arr1.length; i++) {
                        System.out.print(arr1[i] + " ");
                }
        	System.out.println();        
		
		int[] arr2 = {4, 1, 2, 7, 45, 987, 7638};
		System.out.print("Unsorted array: "); 
                for(int i = 0; i < arr2.length; i++) {  
                        System.out.print(arr2[i] + " ");
                }
                arr2 = b.sort(arr2); 
                System.out.println();
                System.out.print("Sorted array with selection sorting: ");
                for(int i = 0; i < arr2.length; i++) {
                        System.out.print(arr2[i] + " ");
                }
                 

			
	}
}
















