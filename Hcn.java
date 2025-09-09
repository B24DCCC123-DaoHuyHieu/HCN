import java.util.Scanner;

public class Hcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai:");
        int a = sc.nextInt();
        System.out.println("chieu rong:");
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println(0);
        } else {
            int chuvi = 2 * (a + b);
            int dienTich = a * b;
            System.out.println(chuvi + " " + dienTich);

        }
        sc.close();
    }
}
