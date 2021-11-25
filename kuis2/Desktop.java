package abstractclass.kuis2;
public class Desktop extends Computer implements Wifi{
    public int battCapcity;
    public Desktop(String ipAddres, int cpuClock, int memory, int storage,int battCapcity){
        super(ipAddres, cpuClock, memory, storage);
        this.battCapcity=battCapcity;
    }
    public void sendData(){
        getInfo();
        System.out.println("Batterai Capcity : "+battCapcity);
        System.out.println("Desktop berhasil mengirim data");
    }
}
