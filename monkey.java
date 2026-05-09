import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int bananaMonkeys = m / k;
        if (m % k != 0) {
            bananaMonkeys++;
        }
        int peanutMonkeys = p / j;
        if (p % j != 0) {
            peanutMonkeys++;
        }
        int monkeysDown = bananaMonkeys + peanutMonkeys;
        int monkeysLeft = n - monkeysDown;
        System.out.println(monkeysLeft);
    }
}
