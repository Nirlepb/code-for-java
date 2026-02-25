class Timer{
    private int hours;
    private int minutes;
    private int seconds;
    Timer(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;

    }
    Timer(){
       this.hours=00;
       this.minutes=00;
        this.seconds=00;
    }
    void setTime(int h,int m,int s){
        this.hours = h;
        this.minutes = m;
        this.seconds = s;

    }
    void showTime(){
        System.out.printf("%02d:%02d:%02d\n",hours,minutes,seconds);
    }
}
public class Main4 {

}
