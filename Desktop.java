public class Desktop extends Computer implements Wifi {
    public int battCapacity;

    public void sendData() {
        System.out.println("Desktop dikontrol dengan wifi");
        System.out.println("-----------------------------");
    }

    public void getInfoD(int battCapacity){
        this.battCapacity=battCapacity;
        System.out.println("battCapacity : " + battCapacity + "mAh");
    }
}