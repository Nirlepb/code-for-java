import java.util.*; 
public class digitSum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the digits :- ");
        int digit=s.nextInt();
        int sum=0;
        int n;
        while (digit>0) {
            n=digit%10;
            sum=sum+n;
            digit=digit/10;

            
        }
        System.out.println(sum);
        s.close();
        
        
    }

}
