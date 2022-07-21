package pl.kurs;

public class Patus {
    private String ksywaNaDzielni;
    private String specjalizacja;

    public Patus(String ksywaNaDzielni, String specjalizacja) {
        this.ksywaNaDzielni = ksywaNaDzielni;
        this.specjalizacja = specjalizacja;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    @Override
    public String toString() {
        return "Patus{" +
                "ksywaNaDzielni='" + ksywaNaDzielni + '\'' +
                ", specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}
