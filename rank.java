import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int rank = sc.nextInt();
            if (rank < min) {
                if (min != Integer.MAX_VALUE) {
                    count++;
                }
                min = rank;
            }
        }
        System.out.println(count);
    }
}
