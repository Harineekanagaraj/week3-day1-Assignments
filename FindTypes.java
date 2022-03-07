package week3.day1;

public class FindTypes {

	public static void main(String[] args) {
		String test="$$ Welcome to 2nd class of automation $$";
		int letter=0,space=0,num=0,specialChar=0;
		char[] array=test.toCharArray();
		
		for(int i=0;i<=array.length-1;i++) {
			
			if(Character.isLetter(array[i])) {
				letter++;
				
			}else if(Character.isDigit(array[i])) {
				num++;
			
				}else if(Character.isSpaceChar(array[i])) {
						space++;
					}else{
							System.out.println("specialcharacter:" );
						specialChar++;
		}
		
	}
		System.out.println(+letter);
		System.out.println(+num);
		System.out.println(+space);
		System.out.println(+specialChar);
}
}