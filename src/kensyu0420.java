import java.util.Scanner;
public class kensyu0420 {
    public static void main(String[] args) {
        System.out.print("整数を入力して下さい");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num = Integer.parseInt(s1);
//        System.out.println(num);
        sc.close();

        if (60 <= num) {
            System.out.println("数値を入力してください：" + num + " " + "合格");
        }
        else {
            System.out.println("数値を入力してください：" + num + " " + "不合格");
        }

    }
}
