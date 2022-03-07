package week3.day1;

public class CharOccurance {

	public static void main(String[] args) {
		String str= "Welcome to chennai";
		char element='e';
		int count=0;
		char[] array=str.toCharArray();
		int length=str.length();
		for(int i=0;i<=str.length();i++) {
			if(str.charAt(i)==element) {
				count++;
		}
	System.out.println(+count);	

	}

}
}