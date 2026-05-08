package pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book();
        book0.setName("Clean code");
        Book book1 = new Book();
        book1.setName("Java. The complete reference");
        Book book2 = new Book();
        book2.setName("Effective Java");
        Book book3 = new Book();
        book3.setName("JavaScript");
        Book[] books = {book0, book1, book2, book3};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        Book temp = books[0];
        books[0] = book3;
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName());
            }
        }
    }
}
