public class area {
    public static void main(String[] args){
        Double width = 4.9;
        Double height = 7.5;
        Double area = width * height;
        Double peri = 2*(width + height);
        System.out.printf("Area: %.2f, Perimeter: %.2f", area, peri);
    }
}
