import java.util.Scanner;
class CandyJar {
    static int N = 10; 
    static int K = 5;    
    static int candies = N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter candies required: ");
        int order = sc.nextInt();
        if (order > candies || order <= 0) {
            System.out.println("INVALID INPUT");
        } 
        else {
            candies = candies - order;
            System.out.println("Number of Candies Sold: " + order);
            if (candies <= K) {
                candies = N;
            }
            System.out.println("Number of Candies available: " + candies);
        }
        sc.close();
    }
}
