public class SMARTDEVICE {
  interface SmartDevice {
    void operate(String deviceName);
}


    public static void main(String[] args) {
        SmartDevice turnOn = name -> System.out.println(name + " is now ON");
        SmartDevice turnOff = name -> System.out.println(name + " is now OFF");

        turnOn.operate("Light");
        turnOn.operate("AC");
        turnOn.operate("TV");

        System.out.println("Turning Off Devices");

        turnOff.operate("Light");
        turnOff.operate("AC");
        turnOff.operate("TV");
    }
}


