import java.util.Scanner;

class Cricketer{
    private String name;
    private String country;
    private int age;
    Cricketer(String name,String country,int age){
        this.name=name;
        this.country=country;
        this.age=age;
    }
    void displayProfile(){
        System.out.println("NAME : "+name+" |"+"  country :  "+ country+" |"+ "  Age : "+ age);
    }
    String getCountry(){
        return country;

    }
    int getAge(){
        return age;
    }

    
}


public class Main5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF PLAYERS: ");
        int size=s.nextInt();
        s.nextLine();

        Cricketer[] cricket=new Cricketer[size];
        for(int i=0;i<size;i++){
            System.out.println("ENTER DETAILS OF PLAYER"+i);
            System.out.print("ENTER THE NAME:  ");
            String name=s.nextLine();
            System.out.print("ENTER THE COUNTRY: ");
            String country=s.nextLine();
            System.out.println("ENTER THE AGE :");
            int Age=s.nextInt();
            s.nextLine();
            cricket[i]=new Cricketer(name, country, Age);}
            int choice;
            System.out.println("-----------------MENU------------");
            System.out.println("1.SEARCH BY COUNTRY");
            System.out.println("FLITER BY AGE");
            System.out.println("DISPLAY ALL");
            System.out.println("4.EXIT");
            System.out.println("----------------------------------");
            System.out.println("ENTER YOUR CHOICE: ");
            choice=s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("ENTER THE COUNTRY");
                    String c=s.nextLine();
                    for(Cricketer cric:cricket){
                        if(cric.getCountry().equalsIgnoreCase(c)){
                            cric.displayProfile();
                        }
                        
                        }
                    
                    
                    break;
                case 2:
                    System.out.println("search by age");
                    int a=s.nextInt();
                    for(Cricketer cric:cricket){
                        if(cric.getAge()>a){
                            cric.displayProfile();
                        }
                    }
                    break; 
                case 3:
                    for(Cricketer cric:cricket){
                        cric.displayProfile();
                    }
                    break; 
                case 4:
                    break;       
                default:
                    break;
            
        }
        s.close();
        
    }

}
