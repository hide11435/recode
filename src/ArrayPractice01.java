public class ArrayPractice01 {

    public static void main(String[] args) {
        int[] nums = {20, 84, 51, 84, 63, 97, 51, 30, 5, 62};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

        }

        double a = (double) sum / nums.length;

        System.out.println("合計値：" + sum);
        System.out.println("平均値:" + a);

    }
}



