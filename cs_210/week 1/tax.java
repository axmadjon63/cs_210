import java.util.Scanner;

public class tax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the cost of your meal: ");
        Double meal_price = Double.parseDouble(scanner.next());
        Double tax_amount = meal_price * 0.12;
        Double tip_amount = meal_price * 0.18;
        Double total = tip_amount + tax_amount + meal_price;
        System.out.printf("Meal price: %.2f\nTip amount: %.2f\nTax amount: %.2f\nGrand total: %.2f", meal_price, tip_amount, tax_amount, total);
        scanner.close();
    }
}
