import java.util.Scanner;

public class weirdSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        
        int acc = 0;
        int odd = 1;
        
        for (int i = 0; i < n; i++) {
            acc += odd;
            odd += 2;
        }
        
        System.out.println(n + " squared is " + acc);
        
        scanner.close();
    }
}