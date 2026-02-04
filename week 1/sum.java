import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer number = scanner.nextInt();
        Integer sum = 0;
        Integer temp = number;
        while (temp != 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        int ones = number%10;
        number /= 10;
        int tens = number%10;
        number /= 10;
        int hundreds = number%10;
        number /= 10;
        int thousands = number%10;
        System.out.printf("%d + %d + %d + %d = %d", thousands, hundreds, tens, ones, sum);
        scanner.close();
    }
}
