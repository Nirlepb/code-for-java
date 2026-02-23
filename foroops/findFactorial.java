public class findFactorial {
    public static int fac(int n){
       if(n<1){
        return 1;
       }
        return n*fac(n-1);
        

    }
    public static void main(String[] args) {
        int n=5;
        
        
        int ans=fac(n);
        System.out.println(ans);
    }

}
