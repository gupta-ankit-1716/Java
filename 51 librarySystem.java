import java.sql.SQLOutput;

class Book {

    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static{
        totalNoOfBooks = 0;
    }
    {
        //object init
        totalNoOfBooks++;
    }

    Book(String author, String title, String isbn) {
        this.isbn = isbn;
        this.author = author;
        this.title= title;

    }

    Book(String isbn){
        this("Unknown", "Unknown", isbn);
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            isBorrowed = true;
            System.out.printf("Enjoy reading the book! %s%n", this.title);
            totalNoOfBooks--;
        }
    }

    void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
            System.out.println("Hope, you enjoyed the book! Please, leave a review.");
            totalNoOfBooks++;
        }else{
            System.out.println("The book is already in the library.");
        }
    }

    static void main(String[] args) {
        Book Science = new Book("Oggy", "Science Book", "12");
        Book Maths = new Book("Jack", "Maths textbook", "23");
        System.out.println("Library Management program");
        System.out.printf("Total books %d%n", getTotalNoOfBooks());
        Maths.borrowBook();
        Science.borrowBook();
        Maths.returnBook();
        Science.borrowBook();
        System.out.printf("The total no. of books are: %d%n", getTotalNoOfBooks());
        Maths.returnBook();
        Science.returnBook();
    }




}
