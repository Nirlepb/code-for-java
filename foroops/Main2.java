import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    void displayDetails(){
        System.out.println("=========================");
        System.out.println("title : " + title);
        System.out.println("Author : "+author);
        System.out.println("price :"+price);
        System.out.println("==========================");
    }
    String getAuthor(){
        return author;
    }
    double getPrice(){
        return price;
    }
}



public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF BOOKS YOU WANT TO ADD? :");
        int size=sc.nextInt();
        sc.nextLine();
        Book[] books=new Book[size];
        for(int i=0;i<size;i++){
            System.out.println("ENTER THE DETAILS OF "+i);
            System.out.println("TITlE :");
            String title=sc.nextLine();

            System.out.println("Author: ");
            String author=sc.nextLine();

            System.out.println("price:");
            double price=sc.nextDouble();
            sc.nextLine();
            books[i]=new Book(title, author, price);

        }
        int Choice;
        do{
            System.out.println("======menu=========");
            System.out.println("1. Search by Author");
            System.out.println("2. Books Above a Certain Price:");
            System.out.println("3. Display All");
            System.out.println("4. Exit");
            System.out.println("===================");
            System.out.println("ENTER THE CHOICE  :  ");
            Choice=sc.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("ENTER THE AUTHOR NAME:");
                    String name=sc.nextLine();
                    for(Book book:books){
                        if(book.getAuthor().equalsIgnoreCase(name)){
                            book.displayDetails();
                        }
                    }
                    
                    break;
                    case 2:
                        System.out.println("enter the price");
                        double price=sc.nextDouble();
                        for(Book book:books){
                            if(book.getPrice()>price){
                                book.displayDetails();
                            }
                        }
                        break;
                    case 3:
                        for(Book book:books){
                            book.displayDetails();
                        }

            
                default:
                    break;
            }


            sc.close();
        }while(Choice>4);
        
        
    }

}
