import java.util.Scanner;
public class interest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        double amount = 1000;
        for (int i = 0; i < years; i++){
            amount *= 1.05;
            System.out.printf("Year %d: %.2f\n", i+1, amount);
        }
    }
}
