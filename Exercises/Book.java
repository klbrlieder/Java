
public class Book {
    String title;
    long pages;
    public Book(String firstTitle, long firstPages) {
        title = firstTitle;
        pages = firstPages;
    }
    public long addPages(int pageAmount) {
        if(pageAmount>=0) {
            return pages = pages + pageAmount;
        }
        return pages;
    }
    public void printBook() {
        System.out.println("Title of the book: "+title+"\nPages of the book: "+pages);
    }

}
