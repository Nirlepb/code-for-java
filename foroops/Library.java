class Author {
    int author_id;
    String name;
    String Nationality;
    Author(int author_id ,String name,String Nationality){
        this.author_id=author_id;
        this.name=name;
        this.Nationality=Nationality;
        

    }
    void displayAuthordetails(){
        System.out.println("Author id: "+ author_id);
        System.out.println("Name: "+ name);
        System.out.println("Nationality :"+Nationality);
    }


    
}
class Book {
    int book_id;
    String title;
    String genre;
    Author author;//compostion
    static int totalbooks=0;
    Book(int book_id,String title,String genre,Author author){
        this.book_id=book_id;
        this.title=title;
        this.genre=genre;
        this.author=author;
        totalbooks++;

    }
    void displaybookdetails(){
        System.out.println("the book id: "+book_id);
        System.out.println("title :"+title);
        System.out.println("genre :"+genre);
        System.out.println("Author Details");
        author.displayAuthordetails();
        System.out.println("---------------------------");
        
    }

    
}




public class Library { 
    public static void main(String[] args) {
        Author a1=new Author(1, "nirlep", "Indian");
        Author a2=new Author(   2,"vedesh","USA");

        Book b1=new Book(111, "the vedas", "god", a1);
        Book b2=new Book(112, "hello", "news", a2);
        
         b1.displaybookdetails();
         b2.displaybookdetails();
         System.out.println("Total Books in Library: " + Book.totalbooks);

    
}

}
