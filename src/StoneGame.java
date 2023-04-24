import java.util.Scanner;

public class StoneGame {

    public static void main(String[] args) {


            System.out.println("石取りゲームを開始します。");

            var num = 25;
            System.out.println("石の数：" + num + "個");
            System.out.println("一度に取れる石の数: 3個");

            int num1 = 25;
            System.out.println("残り：" + num1 + "個");

            var i = 0;
            for (i = 0; i < 25; i++) {
                System.out.print("●");

            }

            var box = 25;
            while ( 0 < box  ) {
            System.out.println("プレイヤーAの番：");
            System.out.println("石の数を入力してください" + " " + "（1〜3まで入力可能です。）");
            var sc = new Scanner(System.in);
            var p1 = sc.nextLine();
            var A = Integer.parseInt(p1);

            box -= A;
                while (!(0< A && A < 4)) {
                    System.out.println("1~3の間で入力してください。");
                    p1 = sc.nextLine();
                    A = Integer.parseInt(p1);
                }

                for (i = 0; i < box; i++) {
                    System.out.print("●");

                }
                System.out.println("残り：" + i);


            System.out.println("プレイヤーBの番：");
            System.out.println("石の数を入力してください" + " " + "（1〜3まで入力可能です。）");
            var sc2 = new Scanner(System.in);
            var p2 = sc2.nextLine();
            var B = Integer.parseInt(p2);

            box -= B;
            while (!(0< B && B < 4)) {
                System.out.println("1~3の間で入力してください。");
                 p2 = sc2.nextLine();
                 B = Integer.parseInt(p2);
            }

            for (i = 0; i < box; i++) {
                    System.out.print("●");

            }
                System.out.println("残り：" + i);
                }

        }

    }







