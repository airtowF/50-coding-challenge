public class Print1To10 {
    public static void main(String[] args) {
        // using for
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // using while
        int count = 1;
        while (count <= 10){
            System.out.print(count + " ");
            count++;
        }
    }
}
