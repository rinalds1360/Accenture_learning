package day3_inheritance;

public class car extends Vehicle{
    String seatbelts;
    String Lights;
    String Doors;

    String Gear;

    public String getGear() {
        return Gear;
    }

    public void setGear(String gear) {
        Gear = gear;
    }

    public String getDoors() {
        return Doors;
    }

    public void setDoors(String doors) {
        Doors = doors;
    }

    public String getLights() {
        return Lights;
    }

    public void setLights(String lights) {
        Lights = lights;
    }


    public void setSeatbelts(String seatbelts) {
        this.seatbelts = seatbelts;
    }

    public String getSeatbelts() {
        return seatbelts;
    }
}
