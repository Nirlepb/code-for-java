import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your income:- ");
        float income = s.nextFloat();
        float taxRate = 0;
        System.out.print("enter date");
        int date=s.nextInt();
        System.out.println(date);

        // Use ranges to ensure the correct block executes
        if (income < 20000) {
            taxRate = 0;
        } 
        else if (income >= 20000 && income < 40000) {
            taxRate = 0.10f; // 10%
        } 
        else if (income >= 40000 && income < 60000) {
            taxRate = 0.20f; // 20%
        } 
        else {
            taxRate = 0.30f; // 30%
        }

        float finalTax = income * taxRate;
        System.out.println("The tax amount is :- " + finalTax);
        System.out.println("Your take-home pay is :- " + (income - finalTax));
        
        s.close();
    }
}