public class Book {
    private String isbn;
    private String title;
    private int pageCount;
    private double price;

    public String getIsbn(){ return isbn; }
    public String getTitle() {return title;}
    public int getPageCount() {return pageCount;}
    public double getPrice() {return price;}

    public void setIsbn(String newIsbn) {isbn = newIsbn;}
    public void setTitle(String newTitle) {title = newTitle;}
    public void setPageCount(int newPageCount){pageCount = newPageCount;}
    public void setPrice(double newPrice) {price = newPrice;}

    public void displayInfo() {
        System.out.println("Title: "+title+"\nISBN: "+isbn+"\nPage Count: "+pageCount+"\nPrice: "+price);
    }


    public Book(String bookName,String ID, int pages, double cost) {
        isbn = ID;
        title = bookName;
        pageCount = pages;
        price = cost;
    }





}
