
public class LibraryBook {
    private String bookTitle;
    private String author;
    private int pages;

    public LibraryBook(String bookTitle, String author, int pages) {
        set_bookTitle(bookTitle);
        set_author(author);
        set_pages(pages);
    }
    
    public LibraryBook(){
        this("Unknown", "Unkown", 1);
    }

    public String get_bookTitle() {
        return this.bookTitle;
    }

    public void set_bookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String get_author() {
        return this.author;
    }

    public void set_author(String author) {
        this.author = author;
    }

    public int get_pages() {
        return this.pages;
    }

    public void set_pages(int pages) {
        this.pages = (pages > 0) ? pages : this.pages;
    }
    public boolean isThick(){
        return this.pages>500;
    }

    public static void main(String[] args){
        LibraryBook book1 = new LibraryBook("something", "one", 123);
        LibraryBook book2 = new LibraryBook("nothing", "two", -123);
        System.out.println(book1.get_pages());
        System.out.println(book2.get_pages());
    }
}