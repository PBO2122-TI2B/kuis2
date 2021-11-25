public class Main {
    public static void main(String[] args) {
        Desktop asus = new Desktop();
        RaspberryPi r = new RaspberryPi();
        RaspberryPi r2 = new RaspberryPi();
        Drone dji = new Drone();
        Drone sym = new Drone();
        Operator o = new Operator();

        System.out.println("Komputer Desktop Asus:");
        System.out.println("-----------------------------");
        asus.getInfo("204.172.0091", 4, 8, 512);
        asus.getInfoD(48000);
        System.out.println("Kontrol Desktop:");
        o.wifiControl(asus);
        System.out.println("Komputer RaspberryPi 2 model B");
        System.out.println("-----------------------------");
        r.getInfo("204.172.0091", 1, 1, 16);
        r.getInfoR(4);
        System.out.println("Kontrol RaspberryPi:");
        o.wifiControl(r);
        System.out.println("Drone DJI Mavic 2 Pro");
        System.out.println("-----------------------------");
        dji.getData(70, 120);
        System.out.println("Kontrol Drone:");
        o.wifiControl(dji);
        System.out.println("Komputer RaspberryPi 3 model B+");
        System.out.println("-----------------------------");
        r.getInfo("204.172.0091", 2, 1, 32);
        r.getInfoR(3);
        System.out.println("Kontrol RaspberryPi:");
        o.radioControl(r2);
        System.out.println("Drone SYMA X8 Pro");
        System.out.println("-----------------------------");
        sym.getData(30, 120);
        System.out.println("Kontrol Drone:");
        o.radioControl(sym);
    }
}
