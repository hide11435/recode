public class MethodPractice04 {

    public static void  main(String[] args) {
            int number = 4;
            int kaizyo = factonal(number);
            System.out.println(  kaizyo + " " + number + "!");
    }

        public static int factonal (int number) {
            var sum = 1;
            for(var i = 1; i <= number ; i++) {
                sum = sum * i ; //

            }
            return sum;
        }
    }










