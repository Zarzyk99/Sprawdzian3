package pl.kurs.interfaces.wiocha;

public class JdgChamaPolaka {


    private PolakCham kierownikPierdolnika;

    public JdgChamaPolaka(PolakCham kierownikPierdolnika) {
        this.kierownikPierdolnika = kierownikPierdolnika;
    }

    public void pracujNaSwojBiznes() {
        kierownikPierdolnika.obrazajSomsiada();
    }
}
