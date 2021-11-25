import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Desktop desktop = new Desktop("192.168.1.1", 5000, 12, 512, 96);
        RaspberryPi berryPi = new RaspberryPi("194.552.1.2", 700, 4, 512, 8443);
        Drone drone = new Drone();
        Operator operator = new Operator();

        int menu;    
        do{
            System.out.println("----- Menu Program -----");
            System.out.println("------------------------");
            System.out.println("1. Desktop");
            System.out.println("2. RaspberryPi");
            System.out.println("3. Drone");
            System.out.println("4. Exit");
            System.out.println("------------------------");
            System.out.print("Menu : ");
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("-------------------------");
                System.out.println("-------- DESKTOP --------");
                System.out.println("-------------------------");
                desktop.getInfo();
                System.out.println("-------------------------");
                operator.WifiControl(desktop);
                System.out.println("-------------------------");
            } else if (menu == 2) {
                System.out.println("---------------------------");
                System.out.println("------- RaspberryPi -------");
                System.out.println("---------------------------");
                berryPi.getInfo();
                System.out.println("---------------------------");
                operator.WifiControl(berryPi);
                System.out.println("---------------------------");
                operator.radioControl(berryPi);
                System.out.println("---------------------------");
            } else if (menu == 3) {
                System.out.println("-----------------------");
                System.out.println("-------- Drone --------");
                System.out.println("-----------------------");
                operator.WifiControl(drone);
                System.out.println("-----------------------");
                operator.radioControl(drone);
                System.out.println("-----------------------");
            } else if (menu == 4) {
                System.out.println(" -----------------------------------");
                System.out.println(" |                                 |");
                System.out.println(" | Anda Keluar dari Menu Program!! |");
                System.out.println(" |                                 |");
                System.out.println(" -----------------------------------");
            }
        }while(menu != 4);
    sc.close();
    }
}

//Adika Ahmad Hanif Nazhir