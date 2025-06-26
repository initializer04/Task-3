import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. List Available Books");
            System.out.println("6. List Borrowed Books");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    System.out.print("Enter user name: ");
                    String name = sc.nextLine();
                    library.registerUser(new User(name));
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    String bookToIssue = sc.nextLine();
                    System.out.print("Enter user name: ");
                    String userToIssue = sc.nextLine();
                    library.issueBook(bookToIssue, userToIssue);
                    break;

                case 4:
                    System.out.print("Enter book title: ");
                    String bookToReturn = sc.nextLine();
                    System.out.print("Enter user name: ");
                    String userToReturn = sc.nextLine();
                    library.returnBook(bookToReturn, userToReturn);
                    break;

                case 5:
                    library.listAvailableBooks();
                    break;

                case 6:
                    library.listBorrowedBooks();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
