package week2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		List<Integer> data=new ArrayList<Integer>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(7);
		data.add(6);
		data.add(8);
		Collections.sort(data);
		System.out.println(data);
System.out.println(data.size());
int count=1;
for(int i=0;i<=data.size();i++) {
	if(data.get(i)!=i+count) {
		System.out.println(i+count);
		break; 
}
	}

}
}
