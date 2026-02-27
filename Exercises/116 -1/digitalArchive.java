public class digitalArchive {
    public static void main(String[] args) {


        Book b1 = new Book("Nightcall", "abc12", 244, 123123);
        Book b2 = new Book("Serpant", "abcd12", 142, 321321);
        Book b3 = new Book("Pavarotti", "abcde12", 312, 315123);

        Book[] boooks = new Book[5];
        boooks[0] = b1;
        boooks[1] = b2;

        Librarian lib1 = new Librarian(20240609,"McGill",23, boooks);

        lib1.displayAllBooks();
        System.out.println();
        lib1.addBook(b3);
        lib1.displayAllBooks();
        System.out.println();
        lib1.removeBook("abcd12");
        lib1.displayAllBooks();
        System.out.println();
        lib1.findBookAndApplyDiscount("abc12", 20);
        lib1.displayAllBooks();
        System.out.println();
        lib1.findBookAndApplyDiscount("abcde12", 20);
        lib1.displayAllBooks();
        System.out.println();
        lib1.updatePrice(b1, 500);
        lib1.displayAllBooks();


    }

}



