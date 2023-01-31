
public class SevenNumber {

    public static void main(String[] args) {
        for(int i=0; i<101;i++) {
            if(i%7==0) {
                System.out.println("clap!");
            }else if(i>70 && i<80) {
                System.out.println("clap!");
            }else {
                System.out.println(i);
            }
        }
    }

}
