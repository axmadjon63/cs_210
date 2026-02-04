import java.util.Scanner;

public class cylinder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double pi = 3.14;
        System.out.print("Please enter the radius and height: ");
        Double radius = Double.parseDouble(scanner.next());
        Double height = Double.parseDouble(scanner.next());
        Double area = radius * radius * pi;
        Double vol = area * height;
        System.out.printf("Area: %.3f, Volume: %.3f", area, vol);
        scanner.close();
    }
}
