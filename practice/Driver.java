import java.util.*;
class Movie{
    private String title;
    private String director;
    private double rating;
    Movie( String title,String director,double rating){
        this.title=title;
        this.director=director;
        this.rating=rating;
    }
    void displayDetails(){
        System.out.println("TITLE  "+title+" |"+" DIRECTORE "+director+" |"+"rating "+rating+" |");

    }
    String getDirectore(){
        return director;
    }
    double getRating(){
        return rating;
    }
}



public class Driver {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print(" ENTER THE NUMBRE OF MOVIES?  ");
        int size=s.nextInt();
        s.nextLine();
        Movie[] movies=new Movie[size];
        for(int i=0 ;i<size;i++){
            System.out.println("ENTER THE DETAILS OF MOVIE"+i);
            System.out.print("enter the title : ");
            String title=s.nextLine();
            System.out.print("enter the directore: ");
            String directore=s.nextLine();
            System.out.print("enter the rating : ");
            double rating=s.nextDouble();
            s.nextLine();
            System.out.println();
            movies[i]=new Movie(title, directore, rating);
        }
        int choice;
        do{
            System.out.println("====================================");
            System.out.println("1.search by directore");
            System.out.println("2.searchabove rating");
            System.out.println("3.display all");
            System.out.println("4.exit");
            System.out.println("====================================");
            System.out.println("ENETR THE CHOICE");
            choice=s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("enter the directore name: ");
                    String d=s.nextLine();
                    for(Movie m:movies){
                        if(m.getDirectore().equalsIgnoreCase(d)){
                            m.displayDetails();
                        }
                    }
                    
                    break;
                case 2:
                    System.out.print("enter the rating: ");
                    int r=s.nextInt();
                    s.nextLine();
                    for(Movie m:movies){
                        if(m.getRating()>r){
                            m.displayDetails();
                        }
                        else{
                            System.out.print("no reult");
                        }
                    break;
                    }    
                case 3:
                    for(Movie m:movies){
                        m.displayDetails();
                    }
                    break;
                case 4:
                    System.out.print("good bye......");
                    break;    
                default:
                    break;
            }
        }
        while (choice<4);
            
        
        s.close();
        
    }
    
    
}
