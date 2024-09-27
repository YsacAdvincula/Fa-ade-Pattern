public class HomeApp {
    private HomeInterface homeInterface;

    public HomeApp(HomeInterface homeInterface) {
        this.homeInterface = homeInterface;
    }

    public void turnEverythingOn() {
        System.out.println("Turning on all services...");
        homeInterface.turnOnAll();
    }

    public void turnEverythingOff() {
        System.out.println("Turning off all services...");
        homeInterface.turnOffAll();
    }

    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();

        HomeApp app = new HomeApp(homeInterface);

        app.turnEverythingOn();
        app.turnEverythingOff();
    }
}