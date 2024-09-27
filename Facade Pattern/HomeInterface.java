public class HomeInterface {
    private Light light;
    private TV tv;
    private AirConditioning ac;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.ac = new AirConditioning();
    }
//Turn on Services
    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        ac.turnOn();
    }
//Turn off Services
    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        ac.turnOff();
    }
}