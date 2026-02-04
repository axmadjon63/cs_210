import java.util.Scanner;
public class weight {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the weight: \n");
        double weight = scanner.nextDouble();
        double price;
        if (weight <= 2){
            price = 5;
        }
        else if (weight <= 10){
            price = 10;
        }
        else{
            price = 10 + (weight - 10)*2;
        }
        System.out.print("Shipping cost: $" + price);
        scanner.close();
    }
}
