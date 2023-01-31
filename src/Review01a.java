
public class Review01a {

    public static void main(String[] args) {
        // 商品価格と税率（％）
        int price=1500;
        int taxrate=10;
        // 消費税額
        int taxamount;
        // taxメソッドに商品価格と税率を渡して消費税額を戻り値として受け取る
        taxamount=tax(price,taxrate);
        // 税込み価格などを表示させる
        System.out.println(price+"円の商品の税込価格は"+(price+taxamount)+"円（消費税は"+taxamount+"円）です。");
    }

    public static int tax(int price,int taxrate) {
        int taxamount=price*taxrate/100;
        return taxamount;
    }

}
