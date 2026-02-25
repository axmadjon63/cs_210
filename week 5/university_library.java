class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String toString() {
        return title + " by " + author;
    }
}
class Professor {
    private String name;
    public Professor(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return name;
    }
}
class LibrarySystem {
    public void checkout(Professor p, Book b) {
        System.out.println(p.getName() + " has checked out " + b.getTitle() + " for research.");
    }
}
public class university_library {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Aneesh");
        Book book = new Book("Think Python", "Allen B. Downey");
        LibrarySystem library = new LibrarySystem();
        library.checkout(professor, book);

        System.out.println("Professor still exists: " + professor.toString());
        System.out.println("Book also still exists: " + book.toString());
    }
}