import java.util.Scanner;

public class reverse {
    public static int[] rev(int[] arr){
        for(int i=0;i<3;i++){
            int a=arr[i];
            int b=arr[6-i-1];
            arr[i]=b;
            arr[6-i-1]=a;
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] di=new int[6];
        for(int i=0;i<di.length;i++){
            System.out.println("neter the number");
            di[i]=s.nextInt();
        }
        System.out.println(rev(di));
        s.close();
    }

}
