import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getName());
    }

    public void issueBook(String title, String userName) {
        Book book = findBookByTitle(title);
        User user = findUserByName(userName);
        if (book != null && user != null && !book.isIssued()) {
            user.borrowBook(book);
            System.out.println("Book issued: " + title + " to " + userName);
        } else {
            System.out.println("Cannot issue book.");
        }
    }

    public void returnBook(String title, String userName) {
        User user = findUserByName(userName);
        if (user != null) {
            for (Book b : user.getBorrowedBooks()) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    user.returnBook(b);
                    System.out.println("Book returned: " + title);
                    return;
                }
            }
        }
        System.out.println("Book not found in user's borrowed list.");
    }

    public void listAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
    }

    public void listBorrowedBooks() {
        System.out.println("\nBorrowed Books:");
        for (Book book : books) {
            if (book.isIssued()) {
                System.out.println(book);
            }
        }
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        return null;
    }

    private User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) return user;
        }
        return null;
    }
}
