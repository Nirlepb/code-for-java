import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=s.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;

        }
        System.out.println(sum);
        s.close();

    }

}
