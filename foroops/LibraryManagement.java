class Book{
    String title;
    Book(String title){
        this.title=title;
    }
}


public class LibraryManagement {
    public static void main(String[] args) {
        Book[] library=new Book[3];
        library[0]=new Book("java");
        library[1]=new Book("hi");
        for(int i=0;i<library.length;i++){
            if(library[i]!=null){
                System.out.println("Book " + i + ": " + library[i].title);
            }
            else {
                System.out.println("Book " + i + ": [Empty Slot]");
            }

        }
        
    }

}
