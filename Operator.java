public class Operator {

    public void WifiControl(IWiFi wifi){
        wifi.sendData();    
    }   

    public void radioControl(IRadio radio){
        radio.sendSignal();
    }
}

//Adika Ahmad Hanif Nazhir