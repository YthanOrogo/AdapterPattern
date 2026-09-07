public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger phoneCharger = new SmartphoneCharger();

        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet phoneOutlet = new SmartphoneAdapter(phoneCharger);

        laptopOutlet.plugIn();
        refrigeratorOutlet.plugIn();
        phoneOutlet.plugIn();
    }
}