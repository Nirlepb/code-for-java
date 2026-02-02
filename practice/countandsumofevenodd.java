import java.util.Scanner;
public class countandsumofevenodd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of numbers you whant to enter : ");
        int n=s.nextInt();
        int ecount=0;
        int ocount=0;
        int esum=0;
        int osum=0;
        

        for(int i=1;i<=n;i++){
            System.out.println("enter the number :");
            int number=s.nextInt();
            
            if(number%2==0){
                ecount+=1;
                esum+=number;


            }
            else{
                ocount+=1;
                osum+=number;
            }
            
        }
        System.out.printf("the count of even numbers is %d and sum of even numbers is "+esum,ecount);
        System.out.printf("the count of odd numbers is %d and sum of odd numbers is "+osum,ocount);
        s.close();
    }

}
