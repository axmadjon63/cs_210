public class population {
    public static void main(String[] args){
        int population = 100000;
        double rate = 1.05;
        int year = 1;
        while (population < 200000){
            population *= rate;
            System.out.println("Year " + year + ": " + population);
            year += 1;
        }
        System.out.println("It will take " + (year-1) + " years to double");
    }
}
