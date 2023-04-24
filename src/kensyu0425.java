public class kensyu0425 {

    public static void main(String[] args) {
            int a = 1; //aに1（式）が入っている
            switch (a)  { //a=1(式)について条件分岐
                case 1:
                    System.out.print("A"); //値が1であればAを表示
                case 2:
                    System.out.print("B"); //breakがなければ
                default:
                    System.out.print("C");
            }
    }
}
