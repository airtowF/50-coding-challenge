import java.util.Scanner;

public class SumOfNumbersFrom1To10 {
    public static void main(String[] args) {
        // I did it to calculate the sum of numbers from 1 to any number you enter
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number up to which you want to calculate the sum:");

        int maxNumber = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= maxNumber; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + maxNumber + " is: " + sum);
        sc.close();
    }
}
