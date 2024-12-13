import java.util.ArrayList;

public class Member {
    // id, name, membershipType, borrowedBooks
    private int id;
    private String name;
    private String membershipType;
    private boolean isActive;
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public Member(int id, String name, String membershipType, ArrayList<Book> borrowedBooks, boolean isActive){
        this.name = name;
        this.membershipType = membershipType;
        this.borrowedBooks = borrowedBooks;
        this.isActive = isActive;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
        System.out.println("The Book with ID " + book.getID() + "  is been borrowed by " + this.name);
        book.setAvailable(false);
    }

    public void returnBook(Book book){
        for (int i = 0; i < borrowedBooks.size(); i++) {
            if (borrowedBooks.get(i).getID() == book.getID()){
                System.out.println("The Book with ID " + borrowedBooks.get(i).getID() + "  is been returned to the library by " + this.name);
                borrowedBooks.remove(i);
                book.setAvailable(true);
            }
        }
    }
}
