import java.util.Scanner;

public class ticket {
    public static void main(String[] args){
        System.out.print("Please enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int price;
        if (age < 13){
            price = 7;
        }
        else if (age < 18){
            price = 10;
        }
        else if (age < 65){
            price = 15;
        }
        else{
            price = 10;
        }
        System.out.println("Ticket Price:$" + price);
        scanner.close();
    }
}
