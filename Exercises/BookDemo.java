public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("King in the Yellow", 320);
        Book b2 = b1;
        b2.addPages(20);
        b1.printBook();
        b2.printBook();
        //they both print the new updated value since both b1 and b2 refer to the same object thus they both change.
        Book b3= new Book(b1.title, b1.pages);
        System.out.println(b1);
        System.out.println(b3);
        //b1 and b3 have different references because they're different objects.
    }
}
