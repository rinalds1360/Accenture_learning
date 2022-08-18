package day3_inheritance;

public class ElectricCar extends car{
    String battery;
    String Engine;
    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public void print(){
        System.out.println("Main info: ");
        System.out.println("    Steering: " + this.getSteering());
        System.out.println("    Speed: " + this.getSpeed());
        System.out.println("    Gear: " + this.getGear());
        System.out.println();
        System.out.println("Other details: ");
        System.out.println("    Seatbelts: " + this.getSeatbelts());
        System.out.println("    Lights: " + this.getLights());
        System.out.println("    Doors: " + this.getDoors());
        System.out.println("    Battery: " + this.getBattery());
        System.out.println("    Engine: " + this.getEngine());
    }

}
