// ::::::first question answer :::::::
// import java.util.Scanner;
// public class Nirlep {

//     public static void main(String[] args)
//     {
//      Scanner n=new Scanner(System.in);
//      System.out.print("enter the first number");
//      int a1=n.nextInt();
//      System.out.print("enter the second number");
//      int a2=n.nextInt();
//      System.out.print("enter the third number");
//      int a3=n.nextInt();
//      int ans=a1+a2+a3;
//      System.out.println(ans);
//      n.close();

//     }
// }







// GPA QUESTION 2
// import java.util.Scanner;
// public class Nirlep {

//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         double gpa=0;
//         for(int i=0;i<3;i++){
//             System.out.print("====ENTER MARKS OF SUBJECT"+(i+1)+":");
//             int m=s.nextInt();
//             if (m>=90) gpa+=9;
//             else if (m>=80) gpa+=8;
//             else if (m>=70) gpa+=7;
//             else if (m>=60) gpa+=6;
//             else gpa+=3;
//              
 
//         }
//         s.close();
//         double finalgpa=gpa/3;
//         System.out.print(finalgpa);
//     }
// }





// question 3
// import java.util.Scanner;
// public class Nirlep {

//     public static void main(String[] args){
//         Scanner r=new Scanner(System.in);
//         System.out.print("enter your name:");
//         String name=r.nextLine();
//         System.out.println("hello"+" "+name+" "+"have a good day😊😊");
//         r.close();
//     }
// }




// question 4
// import java.util.Scanner;
// public class Nirlep {

//     public static void main(String[] args) {

//         Scanner n=new Scanner(System.in);
//         System.out.print("enter distance in kilometer: ");
//         double km =n.nextDouble();
//         double miles= km*0.62;
//         System.out.println("the distance in miles: "+miles);
//         n.close();
//     }
// }


// question 5
// import java.util.Scanner;
// public class Nirlep {

//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter a number: ");
//         if (s.hasNextInt()){
//             int num=s.nextInt();
//             System.out.println(num+"valid integer");

//         }else{
//             System.out.println("not a valid integer");
//         }
//         s.close();

//     }
// }