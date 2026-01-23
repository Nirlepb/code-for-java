import java.util.Scanner;
public class SumAverageRunningInt {
    public static void main(String[] args) {
        int i;int sum=0;
        int n;
        Scanner s =new Scanner(System.in);
        System.out.println("enter the number");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            sum=sum+i;

        }
        float avg=sum/n;
        System.out.printf("THE SUM OF NUMBERS :- %d  ",sum);
        System.out.printf("THE AVG:-  %f",avg);
        System.out.println();
      s.close();
      System.out.println("Done");
    }

}
