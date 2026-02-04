
public class trip{
public static void main(String[] args) {
    int distance = 570;
    double fuel = distance/100*8.5;
    double total = fuel*12500;
    System.out.printf("Distance: " + distance + "km\n");
    System.out.printf("Fuel: %.2f litres\n", fuel);
    System.out.printf("Total cost: %.2f UZS\n", total);
}}