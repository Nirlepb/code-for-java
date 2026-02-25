package practice24;



class book{
    private String title;
    private String author;
    private double price;
    book(){
        title="unknowen";
        author="unknow";
        price=9.0;

    }
    book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void setDetails(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public void displayDetails(){
        System.out.println("----- Book Details -----");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
        System.out.println();

    }
}
public class Bookstore {
    public static void main(String[] args) {
        book b1=new book();
        b1.displayDetails();
        b1.setDetails("nirlep", "vedesh", 1000);
        b1.displayDetails();
    }

    
}