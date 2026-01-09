import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the table");
        int n=s.nextInt();

        for(int i=1;i<=10;i++){
            int ans=n*i;
            System.out.println(n +"* "+ i+ " = "+ ans);


        }
        s.close();
    }

}
