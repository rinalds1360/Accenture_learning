package day3_inheritance;

public class task5 {
    public static void main (String[] args){
        ElectricCar Toyota = new ElectricCar();
        Toyota.setBattery("2kw ags 57%");
        Toyota.setEngine("AM Racing AMR 250-90");
        Toyota.setSeatbelts("leather");
        Toyota.setLights("LED");
        Toyota.setDoors("Toyota original, white");
        Toyota.setGear("3. gear");
        Toyota.setSteering("5 degrees right");
        Toyota.setSpeed("40 km/h");
        Toyota.print();

    }
}
