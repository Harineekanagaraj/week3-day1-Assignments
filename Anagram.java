package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int length=text1.length();
		int length1=text2.length();
		if(length==length1) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		char[] arr=text1.toCharArray();
		char[] arr1=text2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(Arrays.equals(arr,arr1)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		
	}

}
