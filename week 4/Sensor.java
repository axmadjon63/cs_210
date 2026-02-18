
import java.util.Scanner;
public class Sensor {
    private String location;
    private Double reading;

    public Sensor() {
        this.location = "";
        this.reading = 0.0;
    }

    public String get_location() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getReading() {
        return this.reading;
    }

    public void setReading(Double reading) {
        this.reading = (reading > 50.0 && reading < -50.0) ? 0.0 : reading;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Sensor[] temp_array = new Sensor[5];
        for (int i = 0; i < 5; i++){
            temp_array[i].setReading(scanner.nextDouble());
        }
        Double total = 0.0;
        for (int i = 0; i < 5; i++){
            total += temp_array[i].getReading();
        }
        System.out.println("Average: " + total/temp_array.length);        
        scanner.close();
    }
}