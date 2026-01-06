import java.util.Scanner;
public class madLimb{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String abjective1;
        String noun1;
        String abjective2;
        System.out.print("enter an abjective1");
        abjective1=s.nextLine();
        System.out.print("enter an abjective2");
        abjective2=s.nextLine();
        System.out.print("enter an noun1");
        noun1=s.nextLine();
        System.out.println("Today, I found a"+abjective1+"  box hidden in the attic. When I opened it, I couldn't believe my eyes! Inside was a "+abjective2+ noun1+" that looked like it belonged to a wizard.");
        

        s.close();
        
    }
}