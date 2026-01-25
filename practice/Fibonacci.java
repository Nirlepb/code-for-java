import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);

        int n = 3; 
        int max ; // The prompt asked for 20
        System.out.println("enter the number to for n max");
        max=S.nextInt();
        int fn;  
        int fminus1 = 1;
        int fminus2 = 1;
        int sum = fminus1 + fminus2;
        double average;

        System.out.println("The first " + max + " Fibonacci numbers are:");
        // Print the first two manually
        System.out.print(fminus2 + " " + fminus1 + " ");

        while (n <= max) {
            fn = fminus1 + fminus2; // 1. Calculate the NEW number first
            System.out.print(fn + " "); // Print it
            
            sum += fn; // Add it to the total

            // 2. Shift the values for the next round
            fminus2 = fminus1; 
            fminus1 = fn;

            n++; // Increment the counter
        }

        // 3. Cast to double to get the decimal point (e.g., .5)
        average = (double) sum / max;
        System.out.println("\n\nThe average is " + average);
        S.close();
    }
}