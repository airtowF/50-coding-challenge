import java.util.Scanner;

public class MultiplicationTableOf7 {
    public static void main(String[] args) {
        // I tried to do it for any number you enter
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10 ; i++){
            System.out.println(i + " * " + num + " = " + i*num);
        }
    }
}
