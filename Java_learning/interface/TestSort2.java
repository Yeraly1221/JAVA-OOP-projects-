import java.util.Vector;
import java.util.Scanner;

interface Sortable {
	public Vector<Integer>  sort(Vector<Integer> arr);
}

class printInsertArr {
    public void printArray(Vector<Integer> arr) {
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            System.out.println(arr.get(i));
        }
    }

    public Vector<Integer> insertArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want to insert ? ");
        int a = sc.nextInt();
        Vector<Integer> arr = new Vector<>();
        for (int i = 0; i < a; i++) {
            System.out.print("Insert your number: ");
            int num = sc.nextInt();
            arr.add(num);
        }
        return arr;
    }
}
		
class QuickSort  implements Sortable {
	public Vector<Integer>  sort(Vector<Integer> arr) {
		if(arr.size() < 2) {
			return arr;
		}

		Vector<Integer> arr1 = new Vector<>();
		Vector<Integer> arr2 = new Vector<>();
		int target = arr.get(arr.size() / 2);
		for (int i = 0; arr.size() > i; i++) {
			if(i == arr.size() / 2) continue;
			if(arr.get(i) >= target) {
				arr1.add(arr.get(i));
			}else {
				arr2.add(arr.get(i));
			}
		}
		arr1 = sort(arr1);
		arr2 = sort(arr2);
		arr1.add(target);
		for(int i = 0; i < arr2.size(); i++) {
			arr1.add(arr2.get(i));
		}
		return arr1; 
	}
}

class MergeSort implements Sortable {
    public Vector<Integer> sort(Vector<Integer> arr) {
        if (arr.size() < 2) return arr;

        int target = arr.size() / 2;
        Vector<Integer> left = new Vector<>();
        Vector<Integer> right = new Vector<>();

        for (int i = 0; i < target; i++) {
            left.add(arr.get(i));
        }
        for (int i = target; i < arr.size(); i++) {
            right.add(arr.get(i));
        }
        return Merge(sort(left), sort(right));
    }
    private Vector<Integer> Merge(Vector<Integer> left, Vector<Integer> right) {
        Vector<Integer> arr = new Vector<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                arr.add(left.get(i));
                i++;
            } else {
                arr.add(right.get(j));
                j++;
            }
        }
        while(i < left.size()) {
            arr.add(left.get(i));
            i++;
        }

        while(j < right.size()) {
            arr.add(right.get(j));
            j++;
        }
        return arr;
    }
}

class TestSort2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        printInsertArr PrintINs = new printInsertArr();

        Vector<Integer> arr1 = new Vector<>();
        Vector<Integer> arr2 = new Vector<>();

        arr1 = PrintINs.insertArray();
        arr2 = PrintINs.insertArray();

		QuickSort q = new QuickSort();
		MergeSort m = new MergeSort();
		
        System.out.println("Array before:");
        PrintINs.printArray(arr2);
        arr2 = m.sort(arr2);
        System.out.println("Array after");
        PrintINs.printArray(arr2);

        System.out.println("Array before:");
        PrintINs.printArray(arr1);
        arr1 = q.sort(arr1);
        System.out.println("Array after");
        PrintINs.printArray(arr1);

	}
}
