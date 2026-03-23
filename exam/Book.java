import java.util.Scanner;

public class Book {
    private  String title;
    private  String author;
    private double price;
     public Book(String title,String author,double price){
        this.title= title;
        this.author=author;
        this.price=price;

     }
     public Book(){
        this.title="nigieo";
        this.author="nitenrog";
        this.price=20;
     }
     public void setDetails(String title,String author,double price){
        this.title= title;
        this.author=author;
        this.price=price;

     }
     public void displayDetials(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
     }



}
class Main {
    public static void main(String[] args) {
        Scanner  s=new Scanner(System.in);
        Book book1=new Book();
        book1.displayDetials();
        System.out.println("enter th enumbr of books:");
        int size=s.nextInt();
        Book[] books=new Book[size];
        
        for(int i=0;i<size;i++){
            System.out.println("DETAILS OF book  "+i);
            System.out.println("Enter the title of book  "+i);
            String title=s.nextLine();
            System.out.println("enter the author namr of book  "+i );
            String author=s.nextLine();
            System.out.println("price  :");
            double price=s.nextDouble();
            books[i]=new Book(title, author, price);
            

        s.close();
        
    }

    
}
