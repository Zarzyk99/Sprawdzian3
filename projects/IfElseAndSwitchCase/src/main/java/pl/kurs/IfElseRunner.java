package pl.kurs;

public class IfElseRunner {
    public static void main(String[] args) {
        boolean statement = 3 > 2;


        if (statement){
            System.out.println("Warunek prawdziwy");
        } else {
            System.out.println("Warunek nieprawdziwy!");
        }
        System.out.println("Dalsze instrukcje");


        System.out.println("-------------------");
        String wordOne = "koty!!";
        String wordTwo = "pies!!";

        if(wordOne.length() > wordTwo.length()) {
            System.out.println("Pierwsze słowo jest dłuższe!");
        } else if (wordOne.length() < wordTwo.length()) {
            System.out.println("Drugie słowo jest dłuższe!");
        } else {
            System.out.println("Oba słowa są równe!");
            if (wordOne.length() > 5){
                System.out.println("Oraz mają ponad 5 znaków");
            }
        }


        //pomijanie nawiasów klamrowych
        if(true) {
            System.out.println("Prawda1");
        }

        //
        if(false)
            System.out.println("Prawda2");
            System.out.println("Prawda2.5"); //->  ta linia nie nalezy już do ifa i się wykona

        //
        if(true) System.out.println("Prawda3");

        //różnica między kilkoma niezależnymi ifami, a if-else if-else
        String example = "Samochód sportowy";

        if(example.contains("chód")) {
            System.out.println("Zdanie zawiera słowo \"chód\"");
        }
        if(example.contains("sport")) {
            System.out.println("Zdanie zawiera słowo \"sport\"");
        }


        System.out.println("----------------------");
        String example2 = "Samochód sportowy";

        if(example2.contains("chód")) {
            System.out.println("Zdanie zawiera słowo \"chód\"");
        } else if(example2.contains("sport")) {
            System.out.println("Zdanie zawiera słowo \"sport\"");
        } else {
            System.out.println("Zdanie nie zawiera ani \"chód\", ani \"sport\"");
        }









    }
}
