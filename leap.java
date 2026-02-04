import java.util.Scanner;
public class leap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = scanner.nextInt();
        boolean leap = false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leap = true;
                }
            }
            else{
                leap = true;
            }
        }
        if (leap){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
        scanner.close();
    }
}
