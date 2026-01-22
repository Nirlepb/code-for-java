import java.util.Scanner;

public class checkPassFail {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the marks");

        int mark;
        mark=s.nextInt();
        System.out.printf("The mark:-%d ",mark);
        System.out.println();
        if(mark>=50){
            System.out.println("pass");

        }
        else{
            System.out.println("fail");
        }
        System.out.println("done");
        

        s.close();

    }

}
