public class MainKuis2 {
    public static void main(String[] args) {
        Dekstop Asus = new Dekstop();
        RaspberryPi rp = new RaspberryPi();
        Drone djiPlus = new Drone();
        Opererator op = new Opererator();

        op.wifiControl(Asus);
        op.wifiControl(rp);
        op.wifiControl(djiPlus);
        op.radioControl(rp);
        op.radioControl(djiPlus);

    }
}