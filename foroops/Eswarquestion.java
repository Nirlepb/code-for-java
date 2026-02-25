import java.util.Scanner;

class Ration{
    int Adharnumber;
    int Sugar;
    int wheat;
    int rice;
    Ration(int Adharnumber,int sugar,int wheat,int rice){
        this.Adharnumber=Adharnumber;
        this.Sugar=sugar;
        this.wheat=wheat;
        this.rice=rice;
    }
    void displaySugar(){
        System.out.println("the suguar avaible : "+Sugar);
    }
    void displayWheat(){
        System.out.println("the Wheat avaible : "+wheat);
    }
    void displayRice(){
        System.out.println("the Rice avaible : "+rice);
    }
}
public class Eswarquestion { 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF MEMBRES: ");
        int size=s.nextInt();
        Ration[] rations=new Ration[size];
        for(int i=0;i<size;i++){
            System.out.println("DETAILS OF PERSON  "+i);
            System.out.println("Enter the adhar number of person  "+i);
            int Adharnumber=s.nextInt();
            System.out.println("ENTER THE SUGAR AVAILBLE: ");
            int Sugar=s.nextInt();
            System.out.println("ENTER THE WHEAT  :");
            int wheat=s.nextInt();
            System.out.println("ENTER THE rice  :");
            int rice=s.nextInt();
            rations[i]=new Ration(Adharnumber, Sugar, wheat, rice);


        }

        char choice;
        do{


            System.out.println("===================================================================================");
            System.out.println("A.DISPLAY THE AMOUT OF SUGAR AND WHEAT AND RICE");
            System.out.println("B.AVG OF AMOUNT OF SUGAR WHEAT AND RICE");
            System.out.println("C.END");
            System.out.println("===================================================================================");
            System.out.println("enter the choice : ");
            choice=s.next().charAt(0);
            switch (choice) {
                case 'A':
                    for(Ration ration:rations){
                    ration.displayRice();
                    System.out.println("===================================================================================");
                    ration.displaySugar();
                    System.out.println("===================================================================================");
                    ration.displayWheat();
                    System.out.println("===================================================================================");
                    }
                    
                    break;
            
                default:
                    break;
            }
            

        }
        while (choice>3) ;
    }
            
        
        
        
    }


