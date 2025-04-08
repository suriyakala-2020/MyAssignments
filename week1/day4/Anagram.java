package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1="stops", text2="potss";
char[] charArr1 = text1.toCharArray();
char[] charArr2 = text2.toCharArray();

Arrays.sort(charArr1);
text1 = new String(charArr1);

Arrays.sort(charArr2);
text2 = new String(charArr2);

if (text1.equals(text2)) {
	System.out.println("The given strings are Anagram." );
}else {
	System.out.println("The given strings are not an Anagram.");
}

	}

}
