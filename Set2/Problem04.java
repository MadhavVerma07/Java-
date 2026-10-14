import java.util.ArrayList;

public class Problem04 {
    static class Book {
        private int bookId;
        private String bookTitle;
        private int bookPrice;

        public Book(int id, String title, int price) {
            this.bookId = id;
            this.bookPrice = price;
            this.bookTitle = title;
        }

        public int getBookId() {
            return bookId;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public int getBookPrice() {
            return bookPrice;
        }
    }

    static class Main {
        ArrayList<Book> books = new ArrayList<>();

        void addNew(Book b) {
            books.add(b);
        }

        boolean searchBook(Book b) {
            for (Book x : books) {
                if (x.getBookId() == b.getBookId()) {
                    return true;
                }
            }
            return false;
        }

        void deleteBook(int i) {
            if (i >= 0 && i < books.size()) {
                books.remove(i);
            }
        }

        void displayBook(Book b) {
            System.out.println("The book id is " + b.getBookId());
        }
    }

     void main() {
        Book b1 = new Book(123, "Science", 500);
        Main m1 = new Main();
        m1.addNew(b1);
        m1.displayBook(b1);

        if (m1.searchBook(b1)) {
            System.out.println("Book Found");
        } else {
            System.out.println("Book Not Found");
        }
    }
}