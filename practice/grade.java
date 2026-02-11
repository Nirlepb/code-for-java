import java.util.Scanner;
public class grade {
    static String mi(int s1, int s2, int s3){
        int average=(s1+s2+s3)/3;
        if(average>=90){
            return "A";
        }
        else if(average<90 && average>=80){
            return "B";
        }
        else if(average<80 && average>=70){
            return "C";
        }
        else{
            return "D";
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the suject :");
        int subject1=s.nextInt();
        System.out.println("enter the suject :");
        int subject2=s.nextInt();
        System.out.println("enter the suject :");
        int subject3=s.nextInt();
        System.out.println("The grade is:"+mi(subject1, subject2, subject3));
    }
}
