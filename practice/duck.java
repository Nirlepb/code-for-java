import java.util.*;

public class duck {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your name:");
        String  name=scanner.nextLine();
        System.out.print("enter your age:");
        int age=scanner.nextInt();
        System.out.println("your age"+" "+age);
        System.out.println("hello"+" "+name);
        scanner.close(); 
    }

}
