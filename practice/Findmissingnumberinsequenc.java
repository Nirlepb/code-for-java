import java.util.Scanner;
public class Findmissingnumberinsequenc {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number for sum:-");
        int n=s.nextInt();
        int sum=n*(n+1)/2;
        int gisum=0;
        System.out.println("enter the sequnce: ");
        for(int i=1;i<=n-1;i++){

            int num=s.nextInt();
            gisum+=num;
        }
        int misiing=sum-gisum;
        System.out.println("the misiing number is " + misiing);

        s.close();
        
    }
    


}
