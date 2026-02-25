import java.util.Scanner;

class Movie{
    private String title;
    private String directore;
    private double rating;
    Movie(String title,String directore,double rating){
        this.title=title;
        this.directore=directore;
        this.rating=rating;
    }
    void displayDetails(){
        System.out.print("TITLE   :"+title);
        System.out.print("|");
        System.out.print("directore :"+ directore);
        System.out.print("|");
        System.out.print("rating :"+rating);
        System.out.print("|");
    }
    String getDirectore(){
        return directore;
    }
    double getRating(){
        return rating;
    }

}


public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        sc.nextLine();
        Movie[] movies =new Movie[size];
        for(int i=0;i<size;i++){
            System.out.println("\nEnter detailes for Movie "+(i+1));
            System.out.print("Title");
             String title=sc.nextLine();
            System.out.print("Director: ");

            String director = sc.nextLine();

            System.out.print("Rating: ");
            double rating = sc.nextDouble();
            sc.nextLine(); // consume newline
            movies[i]=new Movie(title, director, rating);
        }
        int choice;
        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1. Search by Director");
            System.out.println("2. Movies Above a Certain Rating");
            System.out.println("3. Display All Movies");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");


            choice = sc.nextInt();

            sc.nextLine(); //
            switch (choice) {
                case 1:
                    System.out.print("enter director name: ");
                    String searchDirectore=sc.nextLine();
                    boolean found=false;
                    for(Movie movie:movies){
                        if(movie.getDirectore().equalsIgnoreCase(searchDirectore)){
                            movie.displayDetails();
                            found=true;
                        }
                        }
                        if (!found) {
                        System.out.println("No movies found for that director.");
                    }
                    break;
                case 2: 
                System.out.print("enter the min rating");
                double minrateing =sc.nextDouble();
                for(Movie movie:movies){
                    if(movie.getRating()>minrateing){
                        movie.displayDetails();
                    }
                    else{
                        break;
                    }
                }
                case 3:
                    for(Movie movie:movies){
                    
                        movie.displayDetails();
                    
                }
                


                



                    
                    
                    
            
                default:
                    break;
            }
        }while (choice!=4) ;
        

        sc.close();
        
            
        
        
    }

}
