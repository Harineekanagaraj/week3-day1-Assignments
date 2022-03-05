package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		String value=new String("madam");
		String rev=new String("");
		int length=value.length();
		for(int i=length-1;i>=0;i--) {
		rev=rev+value.charAt(i);
		}
if(value.equalsIgnoreCase(rev)) {
	System.out.println("string is palindrome");
}else {
System.out.println("string is not palindrome");
}
	}

}
