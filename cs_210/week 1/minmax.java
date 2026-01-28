import java.util.Scanner;

public class minmax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int max = Math.max(one, Math.max(two, three));
        int min = Math.min(one, Math.min(two, three));
        int mid = (one + two + three) - (max + min);
        System.out.printf("%d\n%d\n%d", min, mid, max);
        scanner.close();
    }
}
