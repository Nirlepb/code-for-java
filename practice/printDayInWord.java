import java.util.Scanner;
public class printDayInWord {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number of day in range of (0-7)  ");
        int n;
        n=s.nextInt();
        if(n==1){
            System.out.println("Monday");
        }
        else if(n==2){
            System.out.println("Thesuday");
        }
        else if(n==3){
            System.out.println("Wednesday");
        }
        else if(n==4){
            System.out.println("THURSDAY");
        }
        else if(n==5){
            System.out.println("FRIDAY");
        }
        else if(n==6){
            System.out.println("SATURDAY");
        }
        else if(n==7){
            System.out.println("SUNDAY");
        }
        else{
            System.out.println("Enter a vaild number");

        }
        switch(n){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("THESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSADAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("enter a valid number :");  
        }
        s.close();
    
    
}
}
