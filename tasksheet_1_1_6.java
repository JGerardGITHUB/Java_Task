import java.util.Scanner;

public class tasksheet_1_1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            int max = Math.max(num1, Math.max(num2, num3));
            System.out.println("The largest number is: " + max);
        }
    }
}
