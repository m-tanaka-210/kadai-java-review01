package kadai;

public class Review01 {

    public static void main(String[] args) {
        // 商品価格と税率を宣言する
        int price = 1500;
        double tax = 0.10;

        // taxメソッドを呼び出して消費税額を受ける、税率を渡す
        int taxAmount = taxMethod(price ,tax);

        // 戻り値の消費税額 taxInclusivePrice を表示する
        int taxInclusivePrice = price + taxAmount;
        System.out.println(price + "円の商品の税込み価格は" + taxInclusivePrice + "円（消費税は" + taxAmount + "円）です。");

    }
        // 消費税額を計算する、税率は引数とする
    public static int taxMethod(int price, double taxRate) {
        // 消費税額を計算して返す
        int taxAmount = (int)(price * taxRate);
        return taxAmount;
    }
}
