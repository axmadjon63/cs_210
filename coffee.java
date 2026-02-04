import java.util.Scanner;
public class coffee{
public static void main(String[] args) {
    System.out.print("Cappucinos: ");
    Scanner scanner = new Scanner(System.in);
    int cappucinos = scanner.nextInt();
    System.out.print("Muffins: ");
    int muffins = scanner.nextInt();
    double total = cappucinos * 4.50 + muffins * 3.00;
    System.out.printf("Grand total: $%.2f", total);
    scanner.close();
}}