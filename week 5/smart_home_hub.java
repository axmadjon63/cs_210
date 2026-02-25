class SmartDevice {
    private String brand;
    private boolean isPowerOn;
    public SmartDevice(String brand, boolean isPowerOn) {
        this.brand = brand;
        this.isPowerOn = isPowerOn;
    }
    public String getBrand() {
        return brand;
    }
    public boolean isPowerOn() {
        return isPowerOn;
    }
    public String toString() {
        return "Brand: " + brand + ", Power: " + (this.isPowerOn() ? "On" : "Off");
    }
}
class Hub<T> {
    private T device;
    public void storeDevice(T item) {
        this.device = item;
    }
    public T getDevice() {
        return device;
    }
    public void statusReport() {
        System.out.println("Device in Hub: " + device.toString());
    }
}
public class smart_home_hub {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice("Samsung", true);
        Hub<SmartDevice> hub = new Hub<>();
        hub.storeDevice(device);
        hub.statusReport();
        hub = null;
        System.out.println("Hub deleted, device still exists: " + device.toString());
    }
}