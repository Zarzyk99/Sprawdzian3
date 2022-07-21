package pl.kurs;

public class SwitchCaseRunner {
    public static void main(String[] args) {
        //klasyczny switch case
//        final String manager1 = "Robert";
//        final String manager2 = "Jakub";
//        final String councilMember = "Michał";
//        final String accountant = "Justyna";
//
//
//        String login = "Jakub";
//        switch (login){
//            //case "Jakub":
//            case manager1, manager2:
//                System.out.println("Witamy pana kierownika");
//                break;
//            case councilMember:
//                System.out.println("Witamy członka rady nadzorczej");
//                break;
//            case accountant:
//                System.out.println("Witamy panią księgową");
//                System.out.println("Pięknie pani dziś wygląda");
//                break;
//            default:
//                System.out.println("Nieznajomi won!!");
//        }

        // modern switch case from java 13/14
        final String manager1 = "Robert";
        final String manager2 = "Jakub";
        final String councilMember = "Michał";
        final String accountant = "Justyna";


        String login = "Jakub";
        switch (login){
            case manager1, manager2 -> System.out.println("Witamy pana kierownika");
            case councilMember -> System.out.println("Witamy członka rady nadzorczej");
            case accountant -> {
                System.out.println("Witamy panią księgową");
                System.out.println("Pięknie pani dziś wygląda");
            }
            default -> System.out.println("Nieznajomi won!!");
        }


        int chosenOption = 2;

        Vehicle myChosenVehicle = switch (chosenOption) {
            case 1 -> new Vehicle("Lamborghini", "Huracan");
            case 2 -> new Vehicle("Ferrari" , "458 Italia");
            default -> null;
        };

        System.out.println(myChosenVehicle);

    }
}
