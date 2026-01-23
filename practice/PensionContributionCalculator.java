import java.util.*;
public class PensionContributionCalculator {
    public static void  main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the salary ");
        int salary=in.nextInt();
        System.out.print("Enter the age ");
        int age=in.nextInt();
        int contsalary;
        if (salary > 6000) {
                contsalary = 6000;
        }
        else {
                contsalary = salary;
            }   
        double employeeRate,employerRate;
        if(age<=55){
            employeeRate=0.20;
            employerRate=0.17;
        }
        else if(age<=60){
            employeeRate=0.13;
            employerRate=0.13;
        }
        else if(age<=65){
            employeeRate=0.075;
            employerRate=0.09;
        }
        else{
            employeeRate=0.05;
            employerRate=0.075;
            
        }
        double employeeContribution = contsalary * employeeRate;
        double employerContribution = contsalary * employerRate;
        double totalContribution = employeeContribution + employerContribution;
        System.out.println("employee contribution"+employeeContribution);
        System.out.println("employer contribution"+employerContribution);
        System.out.println("total contribution"+totalContribution);
        in.close();

    }

}
