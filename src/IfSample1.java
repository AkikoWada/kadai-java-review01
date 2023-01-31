
public class IfSample1 {
    public static void main(String[] args) {
        int score=80;
        if (score>=60) {
            System.out.println("合格です！");
        }
        if (!(score<60)) {
            System.out.println("これも合格です！");
        }
        String result = (score >= 60) ? "みごと合格です！" : "赤点です...";
        System.out.println(result);
    }
}
