package ua.hillel.qaauto.lesson11;

import java.util.ArrayList;
import java.util.List;

abstract class LibraryMaterial {
    private String title;
    private String author;

    public LibraryMaterial(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void checkOut();

    public abstract void returnMaterial();

    public abstract boolean searchByKeyword(String keyword);
}
enum BookGenre {
    FICTION,
    NON_FICTION,
    SCIENCE_FICTION,
    MYSTERY,
    FANTASY
}

class Book extends LibraryMaterial {
    private BookGenre genre;

    public Book(String title, String author, BookGenre genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void checkOut() {
        System.out.println("Book checked out: " + getTitle());
    }

    @Override
    public void returnMaterial() {
        System.out.println("Book returned: " + getTitle());
    }

    @Override
    public boolean searchByKeyword(String keyword) {
        return getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                getAuthor().toLowerCase().contains(keyword.toLowerCase()) ||
                genre.toString().toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", genre=" + genre +
                '}';
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        List<LibraryMaterial> library = new ArrayList<>();

        library.add(new Book("The Fountainhead", "Ayn Rand", BookGenre.FICTION));
        library.add(new Book("Harry Potter", "J.K. Rowling", BookGenre.FANTASY));
        library.add(new Book("ALICE'S ADVENTURES IN WONDERLAND", "Lewis Carroll", BookGenre.SCIENCE_FICTION));
        library.add(new Book("The Da Vinci Code", "Dan Brown", BookGenre.MYSTERY));

        for (LibraryMaterial material : library) {
            material.checkOut();
            material.returnMaterial();
        }

        String keyword = "J.K. Rowling";
        System.out.println("Search results for keyword '" + keyword + "':");
        for (LibraryMaterial material : library) {
            if (material.searchByKeyword(keyword)) {
                System.out.println(material);
            }
        }
    }
}

