public class hukusyu02 {
    public static void main(String[] args) {
        int i = 0;  //整数型iを初期化
        do { //　while文で抜けるまで"LOOP" を出力し続ける
            System.out.println("LOOP");
            i++; //1ずつ増える
        } while(false); //while文の式がfalse　＞　ループ抜ける
    }
}