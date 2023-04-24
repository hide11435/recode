
public class MethodPractice {
    public static void main(String[] args) {
        int number = 2024; //入力値
        boolean isLeapYear = isLeapYear(number);
        System.out.println(" 西暦 " + number  + isLeapYear);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}


//    public static void main(String[] args) {
//        int year = isLeapYear(year); // 判定する年を設定
//        boolean isLeap = isLeapYear(year); // isLeapYearメソッドを呼び出す
//        System.out.println(year + "西暦 " + isLeap); // 結果を表示する
//    }
//
//    public static boolean isLeapYear(int year) {
//        if (year % 4 == 0) {   //4で割る
//            if (year % 100 == 0) {  //100で割る
//                if (year % 400 == 0) {
//
//                    return true;
//                } else {
//                    return false;
//                }
//
//                } else {
//                    return false;
//                }
//
//                } else {
//                    return false;
//                }
//        }
//    }

