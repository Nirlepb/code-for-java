import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter th enumber");
        int n=s.nextInt();
        float sum=0;
        float avg=0;
        for(int i=1;i<=n;i++){
            sum= sum+i;
        }
        avg=sum/n;
        System.out.println("the sum is "+sum);
        System.out.println("the avg is "+avg);
        s.close();
        
    }

}
