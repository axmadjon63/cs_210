import java.util.Scanner;

public class greet {
    public static void main(String[] args){
        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, %s", name);
        scanner.close();
    }
}
