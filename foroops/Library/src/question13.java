public class question13 {
public static void main(String[] args) {
        int n=1;
        int l=5;
        for(int i=1;i<=l;i++){
            for(int k=0;k<=l-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
            
    }

}
}
