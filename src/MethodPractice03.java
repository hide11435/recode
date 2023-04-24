public class MethodPractice03 {
    public static void main(String[] args) {
        int number = 3; //入力値
        boolean isPrime = isPrime(number);
        System.out.println(" 整数値 " + number + " " + isPrime);
    }

        public static boolean isPrime ( int a){

            if (a <= 1) { // aが1以下ならば偽
                return false;
            }
            for (int i = 2; i <= Math.sqrt(a); i++) {  //初期値は2, aがi以上のとき繰り返す,
                if (a % i == 0) { // 0のとき偽
                    return false;
                }
            }
            return true; //　それ以外は真
        }
    }


