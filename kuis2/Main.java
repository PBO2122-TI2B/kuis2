package abstractclass.kuis2;
import abstractclass.kuis2.Computer;
import abstractclass.kuis2.Desktop;
import abstractclass.kuis2.Drone;
import abstractclass.kuis2.Radio;
import abstractclass.kuis2.RaspberryPi;
import abstractclass.kuis2.Wifi;
public class Main {
    public static void main(String[] args) {
        Operator o = new Operator();
        Desktop d = new Desktop("10 105 96 140",437,16,500,4400);
        RaspberryPi r = new RaspberryPi("10 105 87 780",437,8,1000,147);
        Drone dw = new Drone(140,60);
        o.radioControl(dw);
        o.wifiControl(d);
        o.wifiControl(r);
    }
}
