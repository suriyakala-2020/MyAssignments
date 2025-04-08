package week1.day4;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="We learn Java basics as part of java sessions in java week1"; 
// Split the text into an array of words using space as the delimiter 
String[] words = text.split(" ");
//Create two nested for loops to compare each word with every other word in the String array.  
for (int i = 0; i < words.length; i++) {
	for (int j = i+1; j < words.length; j++) {
//If a duplicate word is found, it is replaced with an empty string.
		if (words[i].equalsIgnoreCase(words[j])) {
			words[j]=" ";
		}
	}	
}
for (String string : words) {
	System.out.print(string+" ");
}
}
}
