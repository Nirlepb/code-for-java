public class Gradeingtool {
    public static char calulate(int m1,int m2,int m3){
        int avg=(m1+m2+m3)/3;
        if(avg>=90){
            return 'a';
        }
        else if(avg>=80){
            return 'b';
        }
        else if(avg>=70){
            return 'c';
        }
        else{
            return 'd';
        }
            
    }
    public static void main(String[] args) {
        System.out.println("enter the sub marks");
        System.out.println(calulate(90, 100, 100));
    }

}
