import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("0 0");
            return;
        }

        int managers = n / 2;
        int workers = n - managers;

        System.out.println(workers + " " + managers);
    }
}
