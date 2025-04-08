package week1.day4;

public class CaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test="changeme";
//convert the given String to a character array.
char[] charArray = test.toCharArray();
//Implement a loop to iterate through each character of the String (from end to start). 
for (int i = 0; i < charArray.length; i++) {
	//Find the odd index within the loop 
	if (i%2!=0) {
		//Inside the loop, change the character to uppercase only if the index is odd 
		charArray[i]=Character.toUpperCase(charArray[i]);				
	}
}
//Print the characters
for (char c : charArray) {
	System.out.print(c);
}
	}

}
