import java.util.Scanner;

public class drive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        Double miles = Double.parseDouble(scanner.next());
        System.out.print("Enter the miles per gallon: ");
        Double mpg = Double.parseDouble(scanner.next());
        System.out.print("Enter the price per gallon: ");
        Double ppg = Double.parseDouble(scanner.next());
        Double price = ppg * (miles / mpg);
        System.out.printf("The cost of driving: %.2f", price);
        scanner.close();
    }
}
