package week1.day3;

public class Library {
	String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library lib1 = new Library();
lib1.addBook("Java book");
lib1.issueBook();
	}

}
