import java.util.Scanner;

public class sumEven {
    public static int ans(int[] arr){
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
        System.out.println("enter the number of element in array");
        int n=s.nextInt();
        int[] ara=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the number"+i+":");
            ara[i]=s.nextInt();
        }
        int total=ans(ara);
        System.out.println("the total"+ " "+total);
        
        s.close();
    }

}
