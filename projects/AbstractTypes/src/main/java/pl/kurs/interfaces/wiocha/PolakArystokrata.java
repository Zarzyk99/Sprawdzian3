package pl.kurs.interfaces.wiocha;

public class PolakArystokrata implements PolakCham, Alkoholik {
    private String firstName;
    private String lastName;

    public PolakArystokrata(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void obrazajSomsiada() {
        System.out.println("Somsiad to parobek i cwierćmóżdżek!");
    }

    @Override
    public double wydmuchajPromile(double iloscWypitejWodkiML) {
        return iloscWypitejWodkiML / 400 + 1;
    }

    public void zarabiajChajsy() {

        ///
    }
}
