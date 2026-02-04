import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean five = number % 5 == 0;
        boolean three = number % 3 == 0;
        if (three){
            System.out.print("Fizz"); 
        }
        if (five){
            System.out.print("Buzz");
        }
        if (!three && !five){
            System.out.println(number);
        }
        scanner.close();
    }
}
