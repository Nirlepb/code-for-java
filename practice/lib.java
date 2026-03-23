 class exception {
    String title;
    exception(String title){
        this.title=title;
    }
    
}
public class lib{
    public static void main(String[] args) {
        exception[] exp=new exception[3];
        exp[0]=new exception("hoi");
        exp[1]=new exception("code");
        exp[2]=new exception("ki");
        for (int i = 0; i < exp.length; i++) {
            if (exp[i] != null) {
                System.out.println("Book " + i + ": " + exp[i].title);
            } else {
                System.out.println("Book " + i + ": [Empty Slot]");
            }

    }
}
}
