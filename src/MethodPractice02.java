public class MethodPractice02 {
    public static void main(String[] args) {
        int number = 5; //入力値
        int get = getsum(number);
        System.out.println(" この数値は " + number + " "  + get);
    }

    public static int getsum (int number) {

        var sum = 0;
        if (number > 0) {
            for (var i = 0; i  < number; i++ ) { //iの変数を作る；　ループ条件；　ループ終わった後の処理
                sum += i + 1;
            }
            return sum;
        } else   {
            return 0;
        }
    }
}
