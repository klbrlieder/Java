public class Librarian {

    private long employeeID;
    private String name;
    private int age;
    private Book[] books = new Book[5];

    public long getEmployeeID() {return employeeID;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public Book[] getBooks() {return books;}

    public void setEmployeeID(long newEmployeeID) {employeeID = newEmployeeID;}
    public void setName(String newName) {name=newName;}
    public void setAge(int newAge) {age=newAge;}
    public void setBooks(Book[] newBooks) {books = newBooks;}


    public Librarian(long ID, String firstName, int firstAge, Book[] firstBooks) {
        employeeID = ID;
        name = firstName;
        age = firstAge;
        books = firstBooks;
    }
    public void addBook(Book book) {
        for(int i=0; i<books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }
    public void removeBook(String isbn) {
        for(int i=0;i<books.length;i++) {
            if (books[i].getIsbn() == isbn) {
                books[i] = null;
                break;
            }
        }
    }
    public Book findBook(String isbn) {
        for(int i=0;i<books.length;i++) {
            if(books[i] != null) {
                if(books[i].getIsbn()==isbn) {
                    return(books[i]);
                }
            }
            else if(books[i] == null) {
                continue;
            }

        }
        return(null);
    }
    public void updatePrice(Book book, double newPrice) {
        book.setPrice(newPrice);
    }
    public void findBookAndApplyDiscount(String isbn, double discountPercentage){
        Book changeBook = findBook(isbn);
        if(changeBook == null) {
            System.out.println("No book found!");
        }
        else if (changeBook != null) {
            updatePrice(changeBook, changeBook.getPrice() * (discountPercentage / 100));
            System.out.println("Price changed correctly!");
        }
    }
    public void displayAllBooks() {
        for(int i=0; i<books.length;i++) {
            if (books[i] != null){
                books[i].displayInfo();
            } else if (books[i] == null) {
                continue;
            }
        }
    }
}
