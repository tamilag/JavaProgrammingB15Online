package day55;

// Taxi :  Engine - Driver - Passenger - Engine

//Encapsulate all the fields as a homework
public class Taxi {
    int plateNumber;
    Engine eng;
    Driver driver;

    public Taxi(int plateNumber, Engine eng, Driver driver) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng +
                '}';
    }
}

class Engine {
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
    }
class Driver {
    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}
