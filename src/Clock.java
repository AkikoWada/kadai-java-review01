
public class Clock {

    public static void main(String[] args) {
        int totalseconds=add(18,32,47);
        System.out.println("1日の中での経過秒数；"+totalseconds+"秒");
    }
    public static int add(int hours,int minutes,int seconds) {
        int totalseconds=(hours*60*60)+(minutes*60)+seconds;
        return totalseconds;
    }
}
