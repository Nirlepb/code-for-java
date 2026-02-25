import java.util.Scanner;

class Number{
    private double value;
    Number(double value){
        this.value=value;
    }
    public double getValue(){
        return value;
    }
    public void setvalue(double value){
        this.value=value;
    }
    public double add(Number n){
        return this.value+n.getValue();

    }
    public double subtract(Number n){
        return this.value-n.getValue();
    }
    public double multiply(Number n){
        return this.value*n.getValue();
    }
    public double divide(Number n){
        if(n.getValue()==0){
            System.out.println("==========Error=======");
            return 1;

        }else{
            return this.value/n.getValue();
        }
        
    }
}
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{ 
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Start Calculation");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if(choice==1){
                System.out.print("Enter first number :");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                Number n1 = new Number(num1);
                Number n2 = new Number(num2);
                System.out.println("\nSelect Operation:");
                System.out.println("(+) Add");
                System.out.println("(-) Subtract");
                System.out.println("(*) Multiply");
                System.out.println("(/) Divide");
                System.out.print("Op: ");
                char op=sc.next().charAt(0);
                double result=0;
                switch (op) {
                    case '+':
                        result=n1.add(n2);
                        
                        break;
                        case '-':
                        result = n1.subtract(n2);
                        break;

                    case '*':
                        result = n1.multiply(n2);
                        break;

                    case '/':
                        result = n1.divide(n2);
                        break;
                
                    default:
                        System.out.println("Invalid operation!");
                        break;
                }
                System.out.println("result: " +result );
            }

        }while(choice!=2);
        sc.close();
    
}

}
