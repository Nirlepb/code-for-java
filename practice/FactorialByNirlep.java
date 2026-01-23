import java.util.Scanner;
public class FactorialByNirlep {
    public static void main(String[] args){
        Scanner f=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER NEED FOR FACTORIAL:  ");
        int n=f.nextInt();
        int ans=1;
        for(int i=n;i>=0;i--){
            
             ans=ans*i;
        }
        System.out.println(ans);
        f.close();

    }

}
