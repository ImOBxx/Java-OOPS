import java.util.Scanner;

public class OOPsBook {
	
     String title;
     String auth;
     long ISBN;
     int books;
     int count;
     
     OOPsBook(String title, String auth)
     {
    	 this.title = title;
    	 this.auth = auth;
     }
     
     OOPsBook(int books, int count, long ISBN)
     {
    	 this.books = books;
    	 this.count = count;
    	 this.ISBN = ISBN;
     }
     
     void input()
     {
    	 Scanner in = new Scanner (System.in);
    	 System.out.println("Enter Title Of The Book: ");
    	 
    	 
     }
     
     
     
     public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
