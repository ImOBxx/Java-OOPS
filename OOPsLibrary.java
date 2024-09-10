
import java.util.ArrayList;
import java.util.Scanner;

public class OOPsLibrary {

    String ti;
    String auth;
    long ISBN;
    int count;
    ArrayList<OOPsBooks> bookList = new ArrayList<>();

    OOPsLibrary(int count, long ISBN, String ti, String auth) {
        this.ISBN = ISBN;
        this.count = count;
        this.ti = ti;
        this.auth = auth;
    }

    void collection() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Title Name: ");
        ti = in.nextLine();
        System.out.println("Enter Author Name: ");
        auth = in.nextLine();
        System.out.println("Enter ISBN Number: ");
        ISBN = in.nextLong();
        bookList.add(new OOPsBooks(0, ISBN, ti, auth));
    }

    void add() {
        count++;
        System.out.println("Book added successfully.");
    }

    void remove() {
        if (count > 0) {
            count--;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("No books available to borrow.");
        }
    }

    void check() {
        for (OOPsBooks book : bookList) {
            System.out.println("Title: " + book.ti);
            System.out.println("Author: " + book.auth);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Count: " + book.count);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        OOPsBooks obj = new OOPsBooks(0, 0, "", "");

        while (true) {
            System.out.println("LIBRARY MENU: ");
            System.out.println("1: Press One For Add A Book.");
            System.out.println("2: Press Two For Borrow A Book.");
            System.out.println("3: Press Three To Check Library Collection.");
            System.out.println("4: Press Four For EXIT.");
            System.out.println("ENTER YOUR CHOICE: ");
            choice = in.nextInt();
            in.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    obj.collection(); // Get book details before adding
                    obj.add();
                    break;
                case 2:
                    obj.remove();
                    break;
                case 3:
                    obj.check();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect Choice :- ");
                    break;
            }
        }
    }
}

