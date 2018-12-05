import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if (isPrime(m)) {
            System.out.println(m + "是素数");
        } else {
            System.out.println(m + "不是素数");
        }
    }

    // 输入一个数判断其是否为素数
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= (int) (Math.floor(Math.sqrt(n))) + 1; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

