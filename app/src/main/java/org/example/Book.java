public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public Book(int id, String title, String author, String genre, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public Book(Book book){
        this.id = book.id;
        this.title = book.title;
        this.author = book.author;
        this.genre = book.genre;
        this.isAvailable = book.isAvailable;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
        }
    
}
