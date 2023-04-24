public class ArrayPractice03 {
    public static void main(String[] args) {
        // 整数を格納する配列を宣言
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 掛け算九九を表示する
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.println(  nums[i] + "×" + nums[j ] + "="+ nums[i] * nums[j] );
            }
            System.out.println();
        }
    }
}
