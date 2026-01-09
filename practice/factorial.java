import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number for factorial:-:=: ");
        int n=s.nextInt();
        int ans=1;
        for (int i=1;i<=n;i++){
            ans=ans*i;

        }
        System.out.println(n+"!"+" = "+ans);
        
        s.close();
    }

}
