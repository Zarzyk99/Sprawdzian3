package pl.kurs;

public class Chopper {
    private String chopperName;
    private MotorcycleEngine engine;


    public Chopper(String chopperName, String engineName, int capacity) {
        this.chopperName = chopperName;
        this.engine = new MotorcycleEngine(engineName, capacity);

    }

    @Override
    public String toString() {
        return "Chopper{" +
                "chopperName='" + chopperName + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static class MotorcycleEngine {//to jest statyczna klasa wewnętrzna( klasa zagnieżdżona)
        private String engineName;
        private int capacityCm3;

        public MotorcycleEngine(String engineName, int capacityCm3) {
            this.engineName = engineName;
            this.capacityCm3 = capacityCm3;
        }


        @Override
        public String toString() {
            return "MotorcycleEngine{" +
                    "engineName='" + engineName + '\'' +
                    ", capacityCm3=" + capacityCm3 +
                    '}';
        }
    }
}
