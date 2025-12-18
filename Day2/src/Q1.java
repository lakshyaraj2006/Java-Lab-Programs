import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int num: nums) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.printf("Even numbers: %d\n", evenCount);
        System.out.printf("Odd numbers: %d", oddCount);
    }
}
