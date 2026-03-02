import java.util.*;

class binarySearch {

	private ArrayList<Integer> UniqueEmployeeIndexes = new ArrayList<Integer>();
	
	public void EmployeeDepartmentIndexes() {
		// we are going to add nums unique between 0 and 99
		for (int i = 0; i < 100; i++) {
			UniqueEmployeeIndexes.add(i);
		}
	}
	public int findNecessaryIndex(int Necessary) {
		int low = 0;//first element
		int higth = UniqueEmployeeIndexes.size() - 1;//last element
		//while keep going while  higth biger or equal low
		while(low <= higth) {
			int midle = (low + higth) / 2; //we found midle of array
			if(UniqueEmployeeIndexes.get(midle) == Necessary) {
				return midle; //if we found our element index 
			}else if(UniqueEmployeeIndexes.get(midle) < Necessary) {
				low = midle + 1;//if our element bigger than midle element
			}
			else {
			higth = midle - 1;//if our element lower than midle element
			}
		}
		return -1;//if necassary elemnt does not exist i our array
	}
}

//Our goul find the index of th necessary element

public class findEmployeeIndex {
	public static void main(String[] args) {
		binarySearch  elm0 = new binarySearch();//create alm0 object 
		elm0.EmployeeDepartmentIndexes(); // create ArrayList in alm0 object
		int necessaryElement = 66; //Which elements index we need to find in a Array
		int elementsIndex = elm0.findNecessaryIndex(necessaryElement);
		System.out.println("your element is located in the " + elementsIndex + " index");
	}
}
