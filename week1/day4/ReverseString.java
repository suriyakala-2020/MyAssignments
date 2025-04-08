package week1.day4;

public class ReverseString {

	public static void main(String[] args) {

	String name="suriyakala";
	char[] rname = name.toCharArray();
	for (int i = rname.length-1; i >=0; i--) {
		System.out.print(rname[i]);
	}

	}

}
