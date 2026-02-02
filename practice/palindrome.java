
// import java.util.Scanner;
// public class palindrome {
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         System.out.print("enter the number to check the palindrome");
//         int orginal=s.nextInt();
//         int d;
//         int reversed=0;
//         int temp=orginal;
//         while (orginal>0) {
//             d=orginal%10;
//             reversed=(reversed*10)+d;
//             orginal=orginal/10;

            
//         }
//         if(temp==reversed){
//             System.out.println("it is palindrome");
//         }else{
//             System.out.println("not a palindrome");
//         }

//         s.close();
//     }

// }

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("enter the number to check the palindrome  : ");
        String orginal=s.nextLine();
        
        String reversed="";
        
        
        for(int i=orginal.length()-1;i>=0;i--) {
            reversed=reversed+orginal.charAt(i);

            
        }
        if(orginal.equals(reversed)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("not a palindrome");
        }

        s.close();
    }

}

