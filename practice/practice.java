import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the  number ofelements");
        int n= s.nextInt();
        s.nextLine();
        String[] nirlep = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the elements");
            nirlep[i]=s.nextLine();
             
        }
        System.out.println(Arrays.toString(nirlep));
        

        
        s.close();

    }

}
