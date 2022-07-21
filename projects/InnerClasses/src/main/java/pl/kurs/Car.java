package pl.kurs;

public class Car {
    private String carName;
    private Engine engine;
    private double mileage;
    private double fuelLevel;

    public Car() {
    }

    public Car(String carName, String engineName, double fuelConsumption, double mileage, double fuelLevel) {
        this.carName = carName;
        this.engine = new Engine(engineName, fuelConsumption);
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
    }

    public void drive100km(){
        if (fuelLevel > engine.fuelConsumption) {
            mileage += 100;
            engine.consumeFuel();
        } else
            throw new IllegalStateException("za mało wahy");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", engine=" + engine +
                ", mileage=" + mileage +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

    public class Engine {
        private String engineName;
        private double fuelConsumption;
        //private Car this$0 = Car.this; //referancja niejawna która jest generowana przez kompilator (napisaliśmy ją tylko dlatego żeby pokazać jakby wyglądałą gdyby można było ją ujawnić)

        public Engine(String engineName, double fuelConsumption) {
            this.engineName = engineName;
            this.fuelConsumption = fuelConsumption;
            //this$0.fuelLevel = 10;
        }

        private void consumeFuel(){
            fuelLevel -= fuelConsumption;
        }

    }

}
