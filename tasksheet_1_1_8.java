public class tasksheet_1_1_8{
    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};
        CumulativeSum(numbers);
    }

    public static void CumulativeSum(int... nums) {
        int totalSum = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < nums.length; i++) {
            cumulativeSum = 0; 
            for (int j = 1; j <= nums[i]; j++) {
                cumulativeSum += j;
            }
            totalSum += cumulativeSum;

            System.out.println("Parameter " + (i + 1) + ": " + nums[i] + " = " + cumulativeSum);
        }

        System.out.println("Total Sum of Cumulative Sums: " + totalSum);
    }
}
