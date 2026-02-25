import java.util.Scanner;

public class VerticalTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++) {          // rows (1 to 10)
            for(int j = 1; j <= n; j++) {       // tables (1 to n)
                System.out.print(j + "x" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
