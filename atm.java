import java.util.Scanner;
public class atm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the PIN: ");
        int pin = 5555;
        for (int i = 0; i < 3; i++){
            if (scanner.nextInt() == pin){
                System.out.println("Access Granted");
                break;
            }
            else{
                if (i == 2){
                    System.out.println("Account locked");
                    break;
                }
                else{
                    System.out.println("Try again");
                }
            }
        }
        scanner.close();
    }
}
