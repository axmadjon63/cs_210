import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius and height: ");
        Double side = Double.parseDouble(scanner.next());
        Double height = Double.parseDouble(scanner.next());
        Double area = Math.sqrt(3)/4 * side * side;
        Double vol = area * height;
        System.out.printf("Area: %.2f, Volume: %.2f", area, vol);
        scanner.close();
    }
}
