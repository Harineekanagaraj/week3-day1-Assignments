package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="we learn java basics as part of java sessions in java week1";
		String[] split=text.split(" ");
        Set<String> dupstr=new LinkedHashSet<String>();
        for(String str:split) {
        	dupstr.add(str);
        }
        System.out.println(dupstr);
	}

}
