
import java.util.Scanner; 
public class hi {
    public static void main(String[] args) {
        System.out.println("enter the name");
        Scanner s=new Scanner(System.in);
        String n;
        n=s.nextLine();
        System.out.printf("your name is %s",n);
        s.close();
        
    }

}
