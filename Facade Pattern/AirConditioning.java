public class AirConditioning implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("The AC has been turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The AC has been turned off!");
    }

}