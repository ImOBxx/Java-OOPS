


	import java.util.ArrayList;
import java.util.List;
	
	public class Book {
		
	    private String title;
	    private String author;
	    private String ISBN;

	    // Constructor
	    public Book(String title, String author, String ISBN) {
	        this.title = title;
	        this.author = author;
	        this.ISBN = ISBN;
	    }

	    // Getters
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getISBN() {
	        return ISBN;
	    }

	    // Overriding toString() method for better display
	    @Override
	    public String toString() {
	        return "Book{" +
	                "title='" + title + '\'' +
	                ", author='" + author + '\'' +
	                ", ISBN='" + ISBN + '\'' +
	                '}';
	    }

	    // Overriding equals() and hashCode() methods for proper comparison and removal
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Book book = (Book) o;

	        return ISBN != null ? ISBN.equals(book.ISBN) : book.ISBN == null;
	    }

	    @Override
	    public int hashCode() {
	        return ISBN != null ? ISBN.hashCode() : 0;
	    }
	}

	class Library {
	    private List<Book> books;

	    // Constructor
	    public Library() {
	        this.books = new ArrayList<>();
	    }

	    // Method to add a book
	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println(book.getTitle() + " by " + book.getAuthor() + " added to the library.");
	    }

	    // Method to remove a book
	    public void removeBook(Book book) {
	        if (books.remove(book)) {
	            System.out.println(book.getTitle() + " by " + book.getAuthor() + " removed from the library.");
	        } else {
	            System.out.println("Book not found in the library.");
	        }
	    }

	    // Method to display all books
	    public void displayBooks() {
	        System.out.println("Books in the library:");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }

	    public static void main(String[] args) {
	        Library library = new Library();

	        // Creating books
	        Book book1 = new Book("1984", "George Orwell", "1234567890");
	        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "1234567891");
	        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567892");

	        // Adding books to the library
	        library.addBook(book1);
	        library.addBook(book2);
	        library.addBook(book3);

	        // Displaying all books
	        library.displayBooks();

	        // Removing a book
	        library.removeBook(book2);

	        // Displaying all books after removal
	        library.displayBooks();
	    }
	}

	

	
