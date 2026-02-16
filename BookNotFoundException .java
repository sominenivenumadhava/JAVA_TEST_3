//package test3.com;
//
//import java.util.HashMap;
//
//class BookNotFoundException extends Exception{
//    public BookNotFoundException(String message){
//        super(message);
//    }
//}
//
//class Book{
//    String isbn;
//    String title;
//    boolean isAvailable;
//
//    public Book(String isbn, String title, boolean isAvailable) {
//        this.isbn = isbn;
//        this.title = title;
//        this.isAvailable = isAvailable;
//    }
//}
//
//class Library{
//    HashMap<String, Book> hm = new HashMap<>();
//
//    int totalBooksCount = 0;
//
//    public void addBook(Book book) {
//        books.put(book.isbn, book);
//        if (book.isAvailable) {
//            totalBooksCount++;
//        }
//    }
//}
