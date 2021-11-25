public class Desktop extends Computer implements IWiFi{
    public int battCapacity;

    Desktop(String ip, int cpu, int memory, int storage, int battery) {
        super(ip, cpu, memory, storage);
        this.battCapacity = battery;
    }
    
    @Override
    public void sendData() {
        System.out.println("Desktop Mengirim data menggunakan WiFi");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Battery     : " +battCapacity + " %");
    }
}

//Adika Ahmad Hanif Nazhir