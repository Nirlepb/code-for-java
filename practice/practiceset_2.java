import java.util.Scanner;
public class practiceset_2 {
    public static void main(String[] args) {
        // question 1
        // float a=7/2*9/2;
        // System.out.println(a);



        // question 2 
        // char grade='A';
        // grade=(char)(grade+8);
        // System.out.println("encrypted Grade " +grade);
        // grade=(char)(grade-8);
        // System.out.println("decrypted Grade " + grade);
        
        
        // question 3
        // int g=25;
        // int u;
        // Scanner s=new Scanner(System.in);
        // System.out.print("enter the number : ");
        // u=s.nextInt();
        // if(g>u){
        //     System.out.println("given number is bigger than input number✌️✌️✌️");

        // }else{
        //     System.out.println("input number is bigger ");
        // }
        // s.close();


        // question 4
        // double v;
        // double u;
        // double a;
        // double s;
        // Scanner sc=new Scanner(System.in);
        // System.out.print("enter the v");
        // v=sc.nextDouble();
        // System.out.print("enter the u");
        // u=sc.nextDouble();
        // System.out.print("enter the a");
        // a=sc.nextDouble();
        // System.out.print("enter the s");
        // s=sc.nextDouble();
        // double ans=((v*v)-(u*u))/(2*a*s);
        // System.out.println(ans);
        // sc.close();
        // int age=18;
        // System.out.printf("my age is  %d ",age);
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        double number=sc.nextInt();
        double ans;
        double ans2;
        ans=Math.sqrt(number);
        ans2= number*number;

        System.out.println("the answer "+ans);
        System.out.println(ans2);
        sc.close();



    }

}
