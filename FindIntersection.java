package week2.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		List<Integer> arr1=new ArrayList<Integer>(6);
		arr1.add(3);
		arr1.add(2);
		arr1.add(11);
		arr1.add(4);
		arr1.add(6);
		arr1.add(7);
		List<Integer> arr2=new ArrayList<Integer>(6);
		arr2.add(1);
		arr2.add(2);
		arr2.add(8);
		arr2.add(4);
		arr2.add(9);
		arr2.add(7);
		for(int i=0;i<arr1.size();i++){
			for(int j=0;j<arr2.size();j++) {
				if(arr1.get(i)==arr2.get(j)) {
					System.out.println(arr1.get(i));
				}
			}
		}
		

	}

}