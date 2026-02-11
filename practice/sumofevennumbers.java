import java.util.Scanner;
public class sumofevennumbers {
    static int evensum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("eneter the lenth of arry");
        int n=s.nextInt();

        int[] sfg=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enetr the element: ");
            int ele=s.nextInt();
            sfg[i]=ele;
        }
        System.out.println("sum: "+ evensum(sfg));
    }

}
