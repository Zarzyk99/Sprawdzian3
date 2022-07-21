package pl.kurs.interfaces.wiocha;

public class WiochaRunner {
    public static void main(String[] args) {
        PolakArystokrata potocki = new PolakArystokrata("Jan", "Potocki");
        UltimatePolak janko = new PolakCebulak("Janko", "z Gnojowic");


        potocki.obrazajSomsiada();

        janko.obrazajSomsiada();


        System.out.println(potocki.wydmuchajPromile(1000));
        System.out.println(janko.wydmuchajPromile(1000));
        System.out.println(janko.kurwijNaNiemcow());


        JdgChamaPolaka januszex = new JdgChamaPolaka(potocki);
        JdgChamaPolaka szamboPol = new JdgChamaPolaka(janko);

        januszex.pracujNaSwojBiznes();
        szamboPol.pracujNaSwojBiznes();

        System.out.println(UltimatePolak.ATRYBUT_POLAKA);
        System.out.println(janko.ATRYBUT_POLAKA);
    }
}
