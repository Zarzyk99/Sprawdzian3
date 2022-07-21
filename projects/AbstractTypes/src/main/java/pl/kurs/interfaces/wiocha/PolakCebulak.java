package pl.kurs.interfaces.wiocha;

public class PolakCebulak implements UltimatePolak {
    private String firstName;
    private String from;

    public PolakCebulak(String firstName, String from) {
        this.firstName = firstName;
        this.from = from;
    }

    @Override
    public String kurwijNaNiemcow() {
        return "Zajebać wszystkich Niemców!!!";
    }

    @Override
    public double wydmuchajPromile(double iloscWypitejWodkiML) {
        return iloscWypitejWodkiML / 600;
    }

    @Override
    public void obrazajSomsiada() {
        System.out.println("Somsiad to złodziej jebany, pojebię go na straż carską!");
    }
}
