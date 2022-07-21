package pl.kurs;

public class ElectricCar {
    public static final double ENERGY_CONSUMPTION = 5;
    public static final double BATTERY_CAPACITY = 40;

    private String producer;
    private String model;
    private double currentBatteryLevel;

    private ElectricCar(String producer, String model, double currentBatteryLevel) {
        this.producer = producer;
        this.model = model;
        this.currentBatteryLevel = currentBatteryLevel;
    }
    //jest to statyczna metoda fabryczna, utorzyliśmy ją żeby aktualny stan paliwa był poprawnie podawany
    public static ElectricCar create(String producer, String model, double currentBatteryLevel){
        if (currentBatteryLevel > BATTERY_CAPACITY || currentBatteryLevel < 0)
            currentBatteryLevel = BATTERY_CAPACITY;
        return new ElectricCar(producer, model ,currentBatteryLevel);
    }


    public void drive100km() {
        if(currentBatteryLevel < ENERGY_CONSUMPTION) {
            throw new IllegalStateException("Nie starczy energii na 100 km!");
        }
        currentBatteryLevel -= ENERGY_CONSUMPTION;
    }
    public void recharge(double energy){
        if (currentBatteryLevel + energy > BATTERY_CAPACITY){
            throw new IllegalArgumentException("Nie można tyle naładować energii!");
        }
        currentBatteryLevel += energy;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", currentBatteryLevel=" + currentBatteryLevel +
                '}';
    }
}
