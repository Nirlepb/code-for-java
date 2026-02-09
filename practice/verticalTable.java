import java.util.Scanner;

public class verticalTable {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=1 ;i<=8;i++){
            for(int j=1;j<=8;j++){
                int ans=i*j;
                System.out.print(j+ " * " + i + " = " + ans + "\t");
            }
            System.out.println();
        }
        s.close();
    }

}
