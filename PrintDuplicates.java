package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer> data=new ArrayList<Integer>();
		data.add(14);
		data.add(12);
		data.add(13);
		data.add(11);
		data.add(15);
		data.add(14);
		data.add(18);
		data.add(16);
		data.add(17);
		data.add(19);
		data.add(18);
		data.add(17);
		data.add(20);
		
//System.out.println(data.size());
int count=0;
for(int i=0;i<data.size();i++) {
	int temp = 0;
	for(int j=i+1;j<data.size()-1;j++) {
		if(data.get(i)==data.get(j)) {
			count=count+1;
			temp=data.get(i);
		}
	}if(count>0) {
		System.out.println(temp);
	}

	}

}
}
