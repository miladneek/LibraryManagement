import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Member> members = new ArrayList<Member>();
    
    public void addBook(Book book){
        books.add(book);
    }

    public void registerMember(Member member){
        members.add(member);
    }

    public ArrayList<String> getAvailableBooks(){
        ArrayList<String> availableBooks = new ArrayList<String>();
        for (Book item: books) {
            if (item.isAvailable()){
                availableBooks.add(item.toString());
            }
        }
        return availableBooks;
    }
}
