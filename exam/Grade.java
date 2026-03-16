import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("enter the score:  ");
            arr[i]=s.nextInt();

        }
        int sum=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                sum+=arr[j];

            }else{
                continue;
            }

        }
        System.out.println(sum);
        s.close();
        
    }
    
    
}
