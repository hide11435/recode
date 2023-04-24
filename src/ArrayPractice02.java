
import java.util.Scanner;
public class ArrayPractice02 {
    public static void main(String args[]) {
        System.out.print("要素数の入力");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        // 配列の定義
        var scores = new int[num1];
        for(var i =0; i < num1; i++ ) {
            var s2 = sc.nextLine();
            var num2 = Integer.parseInt(s2);
            scores[i] = num2;
         }

        int sum = 0;
        for (var i = 0; i < num1; i++) {
            sum += scores[i];
        }

        double a = (double) sum / num1;

        System.out.println("合計値：" + sum);
        System.out.println("平均値:" + a);

        }

    }


