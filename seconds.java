import java.util.Scanner;
public class seconds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();
        int hours = seconds/3600;
        seconds %= 3600;
        int mins = seconds/60;
        seconds %= 60;
        System.out.printf("%d hours, %d mins, %d seconds", hours, mins, seconds);
        scanner.close();
    }
}
