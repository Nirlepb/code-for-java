import java.util.Arrays;
import  java.util.Scanner;
public class reverseArray {
    static int[] reverse(int[] arr){
        int k=arr.length;
        for(int i=0; i<(k)/2;i++){    
            int a=arr[i];
            arr[i]=arr[k-i-1];
            arr[k-i-1]=a;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n=scan.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
        System.out.print("Enter the number:");
        int number=scan.nextInt();
        array[i]=number;
        }
        System.out.println("The reversed array is:"+ Arrays.toString(reverse(array)));

    }
}
