import java.util.Scanner;
public class printNumberInWord {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number in range of (0-9)  ");
        int n;
        n=s.nextInt();
        if(n==1){
            System.out.println("one");
        }
        else if(n==2){
            System.out.println("two");
        }
        else if(n==3){
            System.out.println("Three");
        }
        else if(n==4){
            System.out.println("Four");
        }
        else if(n==5){
            System.out.println("Five");
        }
        else if(n==6){
            System.out.println("Six");
        }
        else if(n==7){
            System.out.println("Seven");
        }
        else if(n==8){
            System.out.println("Eight");
        }
        else if(n==9){
            System.out.println("Nine");
        }
        else{
            System.out.println("Enter a vaild number");

        }
        switch(n){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
            System.out.println("nine");
            break;  
            default:
                System.out.println("enter a valid number :");  
        }
        s.close();
        
    }

}
